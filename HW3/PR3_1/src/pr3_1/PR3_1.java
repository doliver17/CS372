/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.*;

/**
 *
 * @author doliver17
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ArrayList<Integer> numbers = ReadValues();
            MinMaxAverage values = new MinMaxAverage(numbers);
            System.out.printf("Max: %d, Min: %d, Average: %.2f\n", values.getMax(), values.getMin(), values.getAverage());
        } 
        
        catch(Exception e) {
            System.out.println("Error, you entered someting other than an integer");
        }
        
    }
    
    //PT -- If this parameter is List<Integer>, then it will work with many other classes
    //PT -- I want the user to be able to retry the input, rather than having you quit the function. -3
    public static ArrayList<Integer> ReadValues() {
        System.out.println("Enter 10 integers separated by a space: ");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();   
        for(int i = 0; i < 10; i++) {
            integers.add(input.nextInt()); // Will throw an exception if 'input.nextInt() is not an int'
        }
        return integers;
    } 
}
    

