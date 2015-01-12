/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.ArrayList;

/**
 * A class that calculates the min, max, and average of a given ArrayList of integers
 * @author doliver17
 */
public class MinMaxAverage {
    private int max = Integer.MIN_VALUE;
    private int min = Integer.MAX_VALUE;
    private double average;
    
    /**
     * Constructor that calculates the min, max, and average given an ArrayList of integers
     * @param I The ArrayList used to calculate the min, max, and average
     */
    public MinMaxAverage(ArrayList<Integer> I) {
        int sum = 0;
        for (Integer I1 : I) {
            if (I1 > max) {
                max = I1;
            }
            if (I1 < min) {
                min = I1;
            }
            sum += I1;
            average = (double)sum / I.size();
        }
    }
    
    /**
     * Getter for the max
     * @return The max
     */
    public int getMax() {
        return max;
    }
    
    /**
     * Getter for the min
     * @return The min
     */
    public int getMin() {
        return min;
    }
    
    /**
     * Getter for the average
     * @return The average
     */
    public double getAverage() {
        return average;
    }
}
