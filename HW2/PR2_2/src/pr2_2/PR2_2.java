/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_2;
import java.util.*;

/**
 * This class contains the main function
 * @author doliver17
 */
public class PR2_2 {

    /**
     * Adds 100 Gerbils to an ArrayList 
     * Loops through all the Gerbils and makes them hop
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Gerbil> Gerbils = new ArrayList();
        Random rand = new Random();
        for(int i = 0; i < 100; i++) {
            Gerbils.add(new Gerbil(rand.nextInt(100) + 1));
        }
        
        Iterator iterator = ArrayList.iterator();
        }
            
            
    }
    
}

