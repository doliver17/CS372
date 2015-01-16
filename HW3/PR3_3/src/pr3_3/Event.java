/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author doliver17
 */
public class Event {
    private String name;
    private String location;
    private String month;
    private String day;
    private String year;
    
   @Override
   public String toString() {
       return name + "-" + location + "-" + month + "-" + day + "-" + year;
   }
   
   public Event( String n, String l, String m, String d, String y) {
       name = n;
       location = l;
       month = m;
       day = d;
       year = y;
   }
  
   public String GetYear() {
       return year;
   }
   
   public String GetMonth() {
       return month;
   }
   
   public String GetDay() {
       return day;
   }
 
   
   
    
}
