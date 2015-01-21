/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs372_final_tdgame;

import javax.swing.JFrame;

/**
 *
 * @author doliver17
 */
public class CS372_Final_TDGame extends JFrame {

    public CS372_Final_TDGame() {
        
        add(new GameMap());
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setTitle("Practice");
        setResizable(false);
        setVisible(true);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new CS372_Final_TDGame();
    }
    
}
