/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_4;
import java.util.ArrayList;

/**
 * Main class for this project
 * @author Derik
 */
public class PR2_4 {

    /**
     * Main function
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int x = Integer.parseInt(args[0]);
      SeriesCalculator S = new SeriesCalculator();
        
      S.CalculateAll(200000);
      ArrayList<Double> numbers = S.getList();
      PrintList(numbers);
      System.out.print("\n\n");
      System.out.printf("Pi calculatd to %d values: %f", x, S.CalculateSingle(x));
        
    }
    
    /**
     * Prints a passed ArrayList to the screen
     * @param list The list to be printed
     */
    
    public static void PrintList(ArrayList<Double> list) {
        for(int i = 0; i < list.size(); i++)
            System.out.printf("%d: %f\n", i, list.get(i));
    }
    
}
