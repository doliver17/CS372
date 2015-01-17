/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphicpractice;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author doliver17
 */
public class GraphicPractice extends JFrame {

    public GraphicPractice() {
        initUI();
    }
    
    private void initUI() {
        add(new Board());
        
        setSize(250, 200);
        
        setTitle("GraphicPractice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GraphicPractice GP = new GraphicPractice();
                GP.setVisible(true);
            }
    });
    }
    
}
