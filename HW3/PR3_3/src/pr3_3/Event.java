/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.util.ArrayList;

/**
 *
 * @author doliver17
 */
public class Event {
    private String name;
    private String location;
    private String month;
    private String date;
    private String year;
    
   @Override
   public String toString() {
       return name + " " + location + " " + month + " " + date + " " + year;
   }
   
   public void SetAll(String n, String l, String m, String d, String y) {
       name = n;
       location = l;
       month = m;
       date = d;
       year = y;
   }
    
}
