/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;
import java.util.*;
import pr2_1.Gerbil;


/**
 * This class contains the main function
 * @author doliver17
 */
public class PR2_2 {
    static Random rand = new Random();
    /**
     * Adds 100 Gerbils to an ArrayList 
     * Loops through all the Gerbils and makes them hop
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> Gerbils = fillArray();
        displayArray(Gerbils);
    }
    
    
    
    public static ArrayList<Gerbil> fillArray() {
        ArrayList<Gerbil> Gerbils = new ArrayList();
        for(int i = 0; i < 5; i++) {
            Gerbils.add(new Gerbil(rand.nextInt(100) + 1));
        }
        return Gerbils;
    }

    public static void displayArray(ArrayList<Gerbil> Gerbils) {
         Iterator g = Gerbils.iterator();
        while(g.hasNext())
           System.out.println(((Gerbil)g.next()).hop());
    }
}    


