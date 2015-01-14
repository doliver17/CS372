/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs372_exam_derikoliver;
import java.util.Random;

/**
 * A simple Dice class
 * @author doliver17
 */
public class Dice {
    private Random rand = new Random();
    
    /**
     * returns a random number between 1 and 6;
     * @return 
     */
    public int Roll() {
        return rand.nextInt(6) + 1;
    }
}
