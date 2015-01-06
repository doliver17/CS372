/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_5;
import java.util.*;
/**
 *
 * @author Derik
 */
public class PR1_5 {

    /**
     * @param args the command line arguments
     */
    static Random rand = new Random();
    static int[] randN = new int[25];
   
    public static void main(String[] args) {
       fillArray(randN, 25);
       System.out.printf("Random Numbers: ");
       displayArray(randN);
    
       System.out.printf("\n\n");
       compare(randN);
    }
    
    public static void displayArray(int[] a) {
        for(int i = 0; i < a.length; i++)
            System.out.printf("%d, ", a[i]);
    }
    
    public static void fillArray(int[] a, int length) {
         for(int i = 0; i < length; i++) 
            a[i] = rand.nextInt(100) + 1;
    }
    
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
