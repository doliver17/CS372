/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;
import java.util.*;

/**
 * A calculator class to calculate the min, max, and average
 * @author Derik
 */
public class Calculator {
   private ArrayList<Double> scores;
   private double min;
   private double max;
   private double average;
    
   /**
    * Constructor that initializes the ArrayList and sets the min and max
    */
    public Calculator() {
        scores = new ArrayList<Double>();
        min = 1000;
        max = -1000;
    }
    
    /**
     * Adds a homework score to the ArrayList and then check the min and max.
     * Also recalculates the average score
     * @param c The new score to be added
     */
    public void AddScore(double c) {
        scores.add(c);
        if(c < min)
            min = c;
        if(c > max)
            max = c;
        double sum = 0;
        for(int i = 0; i < scores.size(); i++)
            sum += scores.get(i);
        
        average = sum/scores.size();
    }
    
    /**
     * Getter function for the min value
     * @return min score
     */
    public double GetMin() {
        return min;
    }
    
    /**
     * Getter function for the max value
     * @return The max score
     */
    public double GetMax() {
        return max;
    }
    
    /**
     * Getter function for the average value
     * @return The average score
     */
    public double GetAvg() {
        return average;
    }
}
