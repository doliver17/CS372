/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class to manage all of the events
 * @author doliver17
 */
public class EventManager {
    private ArrayList<Event> events = new ArrayList<Event>();
    private ReadFromFile rdr = new ReadFromFile();
    
    /**
     * Uses the ReadFromFile class to read the events from a txt
     */
    public void Read() {
        try {
            rdr.Read();
        } catch (IOException ex) {
            Logger.getLogger(EventManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] words;
        for(int i = 0; i < rdr.GetList().size(); i++) {
            words = rdr.GetList().get(i).split("-");
            events.add(new Event(words[0], words[1], words[2], words[3],words[4]));
        }
    }
    
    /**
     * Adds an event to the event manager
     * @param e The event to be added
     */
    public void AddEvent(Event e) {
        events.add(e);
    }
    
    /**
     * Getter function for the list of events
     * @return The ArrayList of events
     */
    public ArrayList<Event> GetList() {
        return events;
    }
    
    /**
     * Comparator function to compare date
     */
    public static Comparator<Event> DateComparator = new Comparator<Event>() {

        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.GetYear().compareTo(e2.GetYear());
            if(cmp == 0)
                cmp = e1.GetMonth().compareTo(e2.GetMonth());
            if(cmp == 0)
                cmp = e1.GetDay().compareTo(e2.GetDay());
            return cmp;
        }  
    };
    
    /**
     * Comparator function to compare name
     */
    public static Comparator<Event> NameComparaotr = new Comparator<Event>() {

        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.GetName().compareTo(e2.GetName());
            if(cmp == 0)
                cmp = e1.GetYear().compareTo(e2.GetYear());
            if(cmp == 0)
                cmp = e1.GetMonth().compareTo(e2.GetMonth());
            if(cmp == 0)
                cmp = e1.GetDay().compareTo(e2.GetDay());
            return cmp;
        }  
    };
    
    /**
     * Comparator function to compare location
     */
    public static Comparator<Event> LocationComparator = new Comparator<Event>() {

        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.GetLocation().compareTo(e2.GetLocation());
           /* if(cmp == 0)
                cmp = e1.GetYear().compareTo(e2.GetYear());
            if(cmp == 0)
                cmp = e1.GetMonth().compareTo(e2.GetMonth());
            if(cmp == 0)
                cmp = e1.GetDay().compareTo(e2.GetDay());
                   */
            return cmp;
        }  
    };   
}
