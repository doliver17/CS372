/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdfinal;

import javax.swing.*;
import java.awt.*;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
/**
 *
 * @author Derik
 */
public class Screen extends JPanel implements Runnable {
    public Thread gameLoop = new Thread(this);
    
    public static Image[] tileset_track = new Image[100];
    public static Image[] tileset_buttons = new Image[8];
    public static Image[] tileset_enemies = new Image[100];
    
    public static Image map;
    
    public static boolean isFirst = true;
    
    public static Point ms = new Point(0, 0);
    
    public static int myWidth, myHeight;
    public static int money = 200;
    public static int health = 50;
    
    public static Manager manager;
    public static Save save;
    public static Store store;
    
    public static Enemy[] enemies = new Enemy[100];
    
    public Screen(Frame frame) {        
        frame.addMouseListener(new KeyHandler());
        frame.addMouseMotionListener(new KeyHandler());
        gameLoop.start();
    }
    
    public void Define() {
        manager = new Manager();
        save = new Save();
        store = new Store();

        map = new ImageIcon("res/map.png").getImage();
        	
        for(int i= 0; i < tileset_track.length; i++) {
            tileset_track[i] = new ImageIcon("res/TrackCorner.png").getImage();
            tileset_track[i] = createImage(new FilteredImageSource(tileset_track[i].getSource(), new CropImageFilter(0, 31*i, 31, 31)));
        } 
        
        tileset_buttons[0] = new ImageIcon("res/button.png").getImage();
        tileset_buttons[1] = new ImageIcon("res/money.png").getImage();
        tileset_buttons[2] = new ImageIcon("res/heart.png").getImage();
        tileset_enemies[0] = new ImageIcon("res/enemy.png").getImage();
        
        save.loadSave(new File("save/mission.txt"));
        
        for(int i = 0; i < enemies.length; i++) {
        	enemies[i] = new Enemy();
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if(isFirst) {
            myWidth = getWidth();
            myHeight = getHeight();
            Define();
            isFirst = false;            
        }
        
        g.clearRect(0, 0, getWidth(), getHeight());
        manager.draw(g); // Draws the map
        
        for(int i = 0; i < enemies.length; i++) {
        	if(enemies[i].isAlive) {
        		enemies[i].draw(g);
        	}
        }
        store.draw(g); // Draws the store
    }
    
    public int createTime = 2000, createFrame = 0;
    
    public void enemyCreator() {
    	if(createFrame >= createTime) {
    		for(int i = 0; i < enemies.length; i++) {
    			if(!enemies[i].isAlive) {
    				enemies[i].Create(Values.enemyG);
    				break;
    			}
    				
    		}
    		createFrame = 0;
    	}
    	else
    		createFrame += 1;
    }

    public void run() {
        while(true) {
            if(!isFirst) {
            	manager.physics();
            	enemyCreator();
            	for(int i= 0; i < enemies.length; i++) {
            		if(enemies[i].isAlive) {
            			enemies[i].move();
            		}
            	}
            }
           repaint();
                        
           try {
                Thread.sleep(1);
           } 
           catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
        }
    }
}
