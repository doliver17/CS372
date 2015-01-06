/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_6;
import java.util.Scanner;

/**
 *
 * @author Derik
 */
public class PR1_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r = readInt();
        printNumbs(r);                
    }
    public static void printNumbs(int range) {
        int found = 0;
         for (int i = 1; i <= range; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0 && i != j && j != 1) {
                    break;
                }
                if (i == j)
                    if (( ++found ) % 10 == 0)
                        System.out.println(i);
                    else
                        System.out.print(i + "  ");
            }
        }                 
    }

    public static int readInt() {
        System.out.printf("How many numbers should we scan? ");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        return r;
    }
}

