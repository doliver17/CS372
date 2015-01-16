/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;
import java.util.HashMap;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doliver17
 */
public class ReviewManager {
    private HashMap<Restaurant, String> Restaurants;
    private WriteHashMap wtr = new WriteHashMap();
    private ReadIntoHashMap rdr = new ReadIntoHashMap();
    private String Filename = "C:\\Users\\doliver17\\restaurants.txt";
    
    public void AddRestaurant(Restaurant Rest, String Rev) {
        Restaurants.put(Rest, Rev);
    }
    
    public void Read() {
        try {
            Restaurants = rdr.Read();
        } catch (IOException ex) {
            Logger.getLogger(ReviewManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void Write() {
        wtr.Write(Restaurants);
    }
    
    public HashMap<Restaurant, String> GetMap() {
        return Restaurants;
    }
    
}
