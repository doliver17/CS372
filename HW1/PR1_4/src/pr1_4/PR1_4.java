/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_4;
import java.util.Scanner;
/**
 * The class for this program
 * The final static variable is declared within this function
 * @author Derik
 */
public class PR1_4 {
    private static final double PI = 3.14;
   /**
    * The main function within the PR1_4 class
    * Asks the user for a radius, and computes the area
    * of the corresponding circle
    * @author Derik
    */
    public static void main(String[] args) {
        System.out.printf("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        double  radius = scanner.nextDouble();
        double area = PI * (radius * radius);
        
        System.out.printf("The area of your circle is: %.2f\n", area);
        
        
        
    }
    
}
