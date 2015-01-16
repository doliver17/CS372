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
 *
 * @author doliver17
 */
public class EventManager {
    private ArrayList<Event> events = new ArrayList<Event>();
    private ReadFromFile rdr = new ReadFromFile();
    
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
    
    public void AddEvent(Event e) {
        events.add(e);
    }
    
    public ArrayList<Event> GetList() {
        return events;
    }
    
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
    
    
}
