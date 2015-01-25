/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;
import pr2_1.Gerbil;
import java.util.*;

/**
 * Main Class for this project
 * @author doliver17
 */
public class PR2_3 {
    static Random rand = new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        HashMap<String, Gerbil> Gmap = fillMap();
        printMap(Gmap);
        
        
        
    }
    /**
     * Fills and returns HashMap with Gerbils and their names
     * @return A HashMap with Gerbil names and Gerbil objects
     */
     public static HashMap<String, Gerbil> fillMap() {
        HashMap<String, Gerbil> gerbils = new HashMap<String, Gerbil>();
         ReadFromFile file = new ReadFromFile();
         //PT -- you don't need the full filepath here
         file.ReadIn("src\\gNames.txt");
         ArrayList<String> names = file.getNames();
         for(int i = 0; i < 1000; i++) {
            gerbils.put(names.get(rand.nextInt(names.size())), new Gerbil(rand.nextInt(100) + 1));
         }
            return gerbils;
    }
     
     /**
      * Prints a HashMap passed to the function using an iterator
      * @param gerbils The HashMap to be printed to the screen 
      */
    public static void printMap(HashMap<String, Gerbil> gerbils) {
        Iterator<Map.Entry<String, Gerbil>> iterator = gerbils.entrySet().iterator();
        while(iterator.hasNext()) {
            Map.Entry<String, Gerbil> gerbil = iterator.next();
            System.out.printf("Name:" + gerbil.getKey() + "...." + gerbil.getValue().hop());
        }
        
    }

    
}
