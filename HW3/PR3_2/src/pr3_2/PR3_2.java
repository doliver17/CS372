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
            System.out.printf("%.2f\n", T.getArea());
            System.out.printf("%.2f\n", T.getPerimeter());
            
            Ellipse E = new Ellipse(-1, 4);
            
            Ellipse R = new Ellipse(6, 7);
            System.out.printf("%.2f\n", R.getArea());
            System.out.printf("%.2f\n", R.getPerimeter());
            
            Rectangle G = new Rectangle(0, -9);
            
            Rectangle Y = new Rectangle(6, 9);
            System.out.printf("%.2f\n", Y.getArea());
            System.out.printf("%.2f\n", Y.getPerimeter());
            
            
        }
        catch(IllegalArgumentException I) {
            System.out.println(I.getMessage());
        }
        }
        
    
}
