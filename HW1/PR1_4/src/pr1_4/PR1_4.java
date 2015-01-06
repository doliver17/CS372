/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;
import java.util.Scanner;
/**
 * This class calculates the area of a circle given a radius
 * @author Derik
 */
public class PR1_4 {
   /**
    * The main function within the PR1_4 class
    * @param args The arguments passed from the command line
    * @author Derik
    */
    public static void main(String[] args) {
       double radius = readInt();
       double area = calculateArea(radius);
        
        System.out.printf("The area of your circle is: %.2f\n", area);                  
    }
    
    /**
     * Asks the user to enter a value for the radius of a circle
     * @return The radius specified by the user
     */
    public static double readInt() {
         System.out.printf("Enter a radius: ");
         Scanner scanner = new Scanner(System.in);
         double  radius = scanner.nextDouble();
         return radius;
    }
    
    /**
     * Returns the area of a circle based on the passed radius
     * @param r The radius of the circle in which to calculate area for
     * @return The calculated area of the circle
     */
    public static double calculateArea(double r) {
        double area = Math.PI * (r * r);
        return area;
    }
    
}
