/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr1_1;

/**
 *
 * @author Derik
 */

class DataOnly {
  int i;
  float f;
  boolean b;
}

public class PR1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DataOnly d = new DataOnly();
        d.i = 101;
        d.f = 51.5f;
        d.b = false;
        
        System.out.printf("%d, %.1f, %b\n", d.i, d.f, d.b);
    }
    
}
