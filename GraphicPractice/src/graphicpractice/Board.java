/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphicpractice;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;


/**
 *
 * @author doliver17
 */
public class Board extends JPanel {
    
    @Override
    public void paintComponent(Graphics G) {
        super.paintComponent(G);
        drawDonut(G);
    }
    
    private void drawDonut(Graphics G) {
        Graphics2D G2D = (Graphics2D)G;
        
        RenderingHints RH = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        RH.put(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        
        G2D.setRenderingHints(RH);
        Dimension size = getSize();
        double w = size.getWidth();
        double h = size.getHeight();
        
        Ellipse2D e = new Ellipse2D.Double(0, 0, 80, 130);
        G2D.setStroke(new BasicStroke(1));
        G2D.setColor(Color.gray);
        
        for(double deg = 0; deg < 360; deg += 5) {
            AffineTransform at = AffineTransform.getTranslateInstance(w/2, h/2);
            at.rotate(Math.toRadians(deg));
            G2D.draw(at.createTransformedShape(e));
        }
    }    
}
