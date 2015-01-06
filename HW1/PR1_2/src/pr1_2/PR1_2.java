/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_2;

/**
 * This class reads in three arguments from the command line and displays them
 * @author doliver17
 */
public class PR1_2 {

    /**
     * Loops three times, reading three arguments and printing each one to the screen
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = " ";
        for(int i = 0; i < 3; i++) {
            if(args.length > 0)
                s = args[i];
            System.out.println(s);
        }
    }
}