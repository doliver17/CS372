/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author doliver17
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Triangle T = new Triangle(4, 6, 7);
            System.out.printf("%.2f", T.getArea());
        }
        catch(IllegalArgumentException I) {
            
        }
        }
        
    
}
