/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdfinal;

import java.awt.*;
/**
 * Block objects make up the layout of the screen
 * @author Derik
 */
public class Block extends Rectangle {
    public int trackID;
    public int airID;
    
    public Block(int x, int y, int width, int height, int trackID, int airID) {
        setBounds(x, y, width, height);
        this.trackID = trackID;
        this.airID = airID;
    }
    
    public void draw(Graphics g) {
        if(trackID == Values.track) // If the trackID is equal to the values for a track piece
    		g.drawImage(Screen.track, x, y, width, height, null);
        //g.drawRect(x, y, width, height);
    }
}
