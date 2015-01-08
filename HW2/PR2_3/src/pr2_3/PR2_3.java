/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;
import pr2_1.Gerbil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author doliver17
 */
public class PR2_3 {
    static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        HashMap<String, Gerbil> Gmap = fillMap();
        
        
        
    }
    
     public static HashMap<String, Gerbil> fillMap() {
        HashMap<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
         ReadFromFile file = new ReadFromFile();
         file.ReadIn("C:\\Users\\doliver17\\Documents\\GitHub\\CS372\\HW2\\PR2_3\\src\\gNames.txt");
         ArrayList<String> names = file.getNames();
         for(int i = 0; i < 1000; i++) {
            gerbils.put(names.get(i), new Gerbil(rand.nextInt(100) + 1));
         }
            return gerbils;
    }

    
}
