/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;



/**
 * Class that read string from a txt file into an ArrayList
 * @author doliver17
 */
public class ReadFromFile {
    private File f = new File("C:\\Users\\Derik\\Desktop\\events.txt");
    private ArrayList<String> Event = new ArrayList<String>();
    
    /**
     * The function to read
     * @throws IOException 
     */
    public void Read() throws IOException {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line = "";
            String words[];
            while((line = rdr.readLine()) != null ) 
                Event.add(line);          
            rdr.close();         
        } 
        
        catch (FileNotFoundException ex) {
            System.out.println("The file was not found -- file created");
        }  
    }
    
    /**
     * Getter function for the ArrayList of strings
     * @return The ArrayList of string containing information about the events
     */
    public ArrayList<String> GetList() {
        return Event;
    }
}
