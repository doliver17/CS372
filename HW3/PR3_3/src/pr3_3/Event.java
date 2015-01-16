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
 * The Event object class that holds all the information for an event
 * @author doliver17
 */
public class Event {
    private String name;
    private String location;
    private String month;
    private String day;
    private String year;
    
    /**
     * Overriding the toString function allows me to convert an event into a manageable string 
     * @return 
     */
    @Override
    public String toString() {
       return name + "-" + location + "-" + month + "-" + day + "-" + year;
    }
   
    /**
     * Constructor that sets all the member variables
     * @param n The name
     * @param l The location
     * @param m The month
     * @param d The day
     * @param y The year
     */
    public Event( String n, String l, String m, String d, String y) {
       name = n;
       location = l;
       month = m;
       day = d;
       year = y;
    }
    
    /**
     * Getter function for the year
     * @return The year of this event
     */
    public String GetYear() {
       return year;
    }
    
    /**
     * Getter function for the month
     * @return The month of this event
     */
    public String GetMonth() {
       return month;
    }
   
    /**
     * Getter function for the day
     * @return The day of this event
     */
    public String GetDay() {
       return day;
    }
    
    /**
     * Getter function for the name
     * @return The name of this event
     */
    public String GetName() {
       return name;
    }
    
    /**
     * Getter function for the location
     * @return The location of this event
     */   
    public String GetLocation() {
       return location;
    }    
}
