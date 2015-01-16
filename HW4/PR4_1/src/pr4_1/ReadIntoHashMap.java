/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author doliver17
 */
public class ReadIntoHashMap {
    private File f = new File("C:\\Users\\doliver17\\Desktop\\users.txt");
    
    public HashMap<Restaurant, String> Read() throws IOException {
        HashMap<Restaurant, String> Restaurants = new HashMap<Restaurant, String>();
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            String rest[];
            String Details;
            String Notes;
            while((line = rdr.readLine()) != null) {    
                rest = line.split("Notes:");
                Details = rest[0];
                Notes = rest[1];
                Restaurants.put(new Restaurant(Details), Notes);
            }
            rdr.close();
        } 
        
        catch (FileNotFoundException ex) {
            System.out.println("The Restaurants file has been created");
        }
        return Restaurants;
    }
}
