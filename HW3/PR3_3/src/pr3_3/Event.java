/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;

/**
 *
 * @author doliver17
 */
public class Event {
    private String name;
    private String location;
    private String month;
    private int date;
    private int year;
    
    public Event(String n, String l, String m, int d, int y) {
        name = n;
        location = l;
        month = m;
        date = d;
        year = y;
    }
    
    public String GetName() {
        return name;
    }
    
    public String GetLocation() {
        return location;
    }
    
    public String GetMonth() {
        return month;
    }
    
    public int GetDate() {
        return date;
    }
    
    public int GetYear() {
        return year;
    }
}
