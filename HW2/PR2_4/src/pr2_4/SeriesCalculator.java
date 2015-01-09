/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;
import java.util.ArrayList;

/**
 * The class to calculate the PI series
 * @author Derik
 */
public class SeriesCalculator {
    private ArrayList<Double> numbers;
    
    /**
     * Basic constructor - Initializes the ArrayList
     */
    public SeriesCalculator() {
        numbers = new ArrayList<Double>(); 
    }
    
    /**
     * Calculates all values from 1 to 'l' which is specified by the user
     * @param l How far to calculate the series
     */
    public void CalculateAll(int l) {
        double pi = 4.0;
        int count = 0;
        for(int i = 3; i <= l * 2 + 3; i += 2) {
            if(count % 2 == 0) {
                pi -= (4.0 / (double)i); 
                numbers.add(pi);
            }
            else {
                pi += (4.0 / (double)i); 
                numbers.add(pi);
            }
            count++;
        }
    }
    
    /**
     * Getter function for the ArrayList
     * @return The ArrayLit with the numbers calculated to be in the series
     */
    public ArrayList<Double> getList() {
        return numbers;
    }
    
    /**
     * Calculates a single value as far in as the user specified
     * @param l How far to calculate the series
     * @return The number calculated 
     */
    public double CalculateSingle(int l) {
        double pi = 4.0;
        int count = 0;
        for(int i = 3; i <= l * 2 + 3; i += 2) {
            if(count % 2 == 0) {
                pi -= 4.0 / (double)i; 
            }
            else {
                pi += 4.0 / (double)i;
            }
            count++;
        }
        return pi;
    }
    
}



