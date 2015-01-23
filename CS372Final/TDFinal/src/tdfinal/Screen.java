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
    public Thread gameLoop = new Thread(this); // Create a new thread that will be used to draw movement
    
    public static Image[] tileset_track = new Image[100];// Holds images for the track
    public static Image[] tileset_indicators = new Image[8]; // Holds images for indicators
    public static Image[] tileset_buttons = new Image[8]; // Holds images for buttons
    public static Image[] tileset_soldier = new Image[8]; // Holds images for the soldier enemy
    
    public static Image map; // The image for the background map
    
    public static boolean isFirst = true; // Flag for first time running
    
    public static Point ms = new Point(0, 0); // Point to keep track of mouse position
    
    public static int myWidth, myHeight; // Width and Height of the JPanel
    public static int money = 200; // Starting money	
    public static int health = 10; // Starting Health
    
    public static Manager manager;
    public static Save save;
    public static Store store;
    
    public static Enemy[] enemies = new Enemy[100]; // Holds all the enemies
    
    public Screen(Frame frame) {        
        frame.addMouseListener(new KeyHandler()); // Adds a mouse listener to the JFrame
        frame.addMouseMotionListener(new KeyHandler()); // Adds a mouse motion listener to the JFrame
        gameLoop.start(); // Starts the gameLoop or 'run' function for the thread
    }
    
    public void Define() {
        manager = new Manager(); // Initialize other classes
        save = new Save();
        store = new Store();

        map = new ImageIcon("res/map.png").getImage(); // Load background image
        	
        
        for(int i= 0; i < tileset_track.length; i++) {
            tileset_track[i] = new ImageIcon("res/TrackCorner.png").getImage();// Loads the track images into the array
            tileset_track[i] = createImage(new FilteredImageSource(tileset_track[i].getSource(), new CropImageFilter(0, 31*i, 31, 31)));
        } 
        
        // Load images for the indicators
        tileset_indicators[0] = new ImageIcon("res/button.png").getImage();
        tileset_indicators[1] = new ImageIcon("res/money.png").getImage();
        tileset_indicators[2] = new ImageIcon("res/heart.png").getImage();
        
        // Load images for the buttons
        tileset_buttons[4] = new ImageIcon("res/lasertower.png").getImage();
        tileset_buttons[3] = new ImageIcon("res/trash.png").getImage();
        
        // Load images for the solider
        tileset_soldier[0] = new ImageIcon("res/enemyD1.png").getImage();
        tileset_soldier[1] = new ImageIcon("res/enemyD2.png").getImage();
        
        tileset_soldier[2] = new ImageIcon("res/enemyR1.png").getImage();
        tileset_soldier[3] = new ImageIcon("res/enemyR2.png").getImage();
        
        tileset_soldier[4] = new ImageIcon("res/enemyL1.png").getImage();
        tileset_soldier[5] = new ImageIcon("res/enemyL2.png").getImage();
        
        tileset_soldier[6] = new ImageIcon("res/enemyU1.png").getImage();
        tileset_soldier[7] = new ImageIcon("res/enemyU2.png").getImage();
        
        // Save the configuration of the track
        save.loadSave(new File("save/mission.txt"));
        
        // Initialize enemies
        for(int i = 0; i < enemies.length; i++) {
        	enemies[i] = new Enemy();
        }
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
        if(isFirst) { // If its the first time painting
            myWidth = getWidth();
            myHeight = getHeight();
            Define();
            isFirst = false;            
        }
        
        g.clearRect(0, 0, getWidth(), getHeight());
        manager.draw(g); // Draws the map
        
        for(int i = 0; i < enemies.length; i++) {
        	if(enemies[i].isAlive) {
        		enemies[i].draw(g); // Draws the enemies if they are alive/ on the screen
        	}
        }
        store.draw(g); // Draws the store
        
        if(health < 1) {
        	g.setColor(Color.red);
        	g.setFont(new Font("Helvetica", Font.BOLD, 40));
        	g.drawString("Game Over", myWidth/2, myHeight/2);
        }
    }
    
    public int createTime = 2000, createFrame = 0;
    
    public void enemyCreator() { // Creates enemies
    	if(createFrame >= createTime) {
    		for(int i = 0; i < enemies.length; i++) {
    			if(!enemies[i].isAlive) { // If the enemy is no longer alive
    				enemies[i].Create(Values.enemyG); // Create a new one
    				break;
    			}
    				
    		}
    		createFrame = 0;
    	}
    	else
    		createFrame += 1;
    }

    public void run() { // The moving of the enemies is done within the thread's run function
        while(true) {
            if(!isFirst && health > 0) { // If its not the first time running
            	enemyCreator(); // Creates enemies
            	for(int i= 0; i < enemies.length; i++) {
            		if(enemies[i].isAlive) {
            			enemies[i].move();
            		}
            	}
            }
            else if(health < 1)
            	for(int i = 0; i < enemies.length; i++)
            		enemies[i].deleteEnemy(); // Deletes all enemies on the screen
            
           repaint();// Repaint the screen
                        
           try {
                Thread.sleep(1);// Causes the thread to pause for 1 millisecond in order to slow down movement
           } 
           catch (Exception ex) {
               System.out.println(ex.getMessage());
           }
        }
    }
}
