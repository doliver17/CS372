/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_5;
import java.util.*;
/**
 * This class finds 25 random numbers and compares each to a second randomly generated number
 * @author Derik
 */
public class PR1_5 {
    static Random rand = new Random();
    static int[] randN = new int[25];
    /**
     * The main function for this class
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       fillArray(randN, 25);
       System.out.printf("Random Numbers: ");
       displayArray(randN);
    
       System.out.printf("\n\n");
       compare(randN);
    }
    
    /**
     * Prints a passed array to the screen
     * @param a The array passed to this function 
     */
    public static void displayArray(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.printf("%d, ", a[i]);
    }
    
    /**
     * Fills an array with random numbers between 1 and 100
     * @param a An array to be filled
     * @param length The specified length of the array
     */
    public static void fillArray(int[] a, int length) {
         for(int i = 0; i < length; i++) 
            a[i] = rand.nextInt(100) + 1;
    }
    
    /**
     * Compares each number in the array to a second randomly specified number
     * @param a The array in which to compare other random numbers to
     */
    public static void compare(int[] a) {
        for(int i = 0; i < a.length; i++) {
             int x = randN[i];
            int y = rand.nextInt(100) + 1;
            
            if(x > y)
                System.out.printf("%d is greater than %d\n", x, y);
            else if(x < y)
                System.out.printf("%d is less than %d\n", x, y);
            else if(x == y)
                System.out.printf("%d is equal to %d\n", x, y);
        }       
    }
}
