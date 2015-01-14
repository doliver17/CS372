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
 *
 * @author doliver17
 */
public class ReadFromFile {
    private File f = new File("C:\\Users\\doliver17\\Desktop\\Event.txt");
    private ArrayList<String> Event = new ArrayList<String>();
    private DefaultTableModel eModel = new DefaultTableModel();
    private int row = 1;
    
    public ReadFromFile() {
     
    }
    
    public void Read() throws IOException {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line = "Stuff";
            String words[];
            while((line = rdr.readLine()) != null ) 
                Event.add(line);          
            rdr.close();         
        } 
        
        catch (FileNotFoundException ex) {
            System.out.println("The file was not found -- file created");
        }  
    }
    
    public ArrayList<String> GetList() {
        return Event;
    }
    
    public DefaultTableModel getModel() {
        return eModel;   
    }

}
