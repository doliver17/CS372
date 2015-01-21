/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs372_final_tdgame;

import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author doliver17
 */
public class Missile {
    private int x, y;
    private Image image;
    boolean visible;
    private int width, height;
    
    private final int BOARD_WIDTH = 390;
    private final int MISSLE_SPEED = 2;
    
    public Missile(int x, int y) {
        ImageIcon i = new ImageIcon(this.getClass().getResource("missile.png"));
        image = i.getImage();
        visible = true;
        width = image.getWidth(null);
        height = image.getHeight(null);
        this.x = x;
        this.y = y;
    }
    
    public Image getImage() {
        return image;
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public boolean isVisible() {
        return visible;
    }
    
    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
    
    public void move() {
        x += MISSLE_SPEED;
        if(x > BOARD_WIDTH)
            visible = false;
    }
}
