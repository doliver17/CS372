/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdfinal;

import java.awt.event.*;
import java.awt.*;
/**
 *
 * @author Derik
 */
public class KeyHandler implements MouseMotionListener, MouseListener {

  
    public void mouseDragged(MouseEvent e) {
        Screen.ms = new Point((e.getX()) - ((Frame.size.width - Screen.myWidth)/2), (e.getY()) - ((Frame.size.height - Screen.myHeight)) - ((Frame.size.width - Screen.myWidth)/2));     
    }

    
    public void mouseMoved(MouseEvent e) {
        Screen.ms = new Point((e.getX()) - ((Frame.size.width - Screen.myWidth)/2), (e.getY()) - ((Frame.size.height - (Screen.myHeight)) - (Frame.size.width - Screen.myWidth)/2));             
    }

    
    public void mouseClicked(MouseEvent e) {
        
    }

    
    public void mousePressed(MouseEvent e) {
        Screen.store.Click(e.getButton());
    }

    
    public void mouseReleased(MouseEvent e) {
        
    }

    
    public void mouseEntered(MouseEvent e) {
        
    }

    
    public void mouseExited(MouseEvent e) {
        
    }
    
}
