/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cs372_exam_derikoliver;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class to read values into a HashMap from a txt file
 * Also writes files from a HashMap to a txt file
 * @author doliver17
 */
public class ReaderWriter {
    
    /**
     * A function to read values from a txt file into a HashMap
     * @return A HashMap filled with the values in the txt file
     * @throws IOException 
     */
    public HashMap<String, Integer> Read() throws IOException {
        HashMap<String, Integer> users = new HashMap<String, Integer>();
        
        File f = new File("C:\\Users\\doliver17\\Desktop\\users.txt");
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            String name[];
            while((line = rdr.readLine()) != null) {
                name = line.split(" ");
                users.put(name[0], Integer.parseInt(name[1]));
            }
            rdr.close();
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    /**
     * Writes files in a HashMap to a txt file
     * @param users The HashMap to be written
     */
    public void Write(HashMap<String, Integer> users) {
        Iterator<Map.Entry<String, Integer>> iterator = users.entrySet().iterator();
        File f = new File("C:\\Users\\doliver17\\Desktop\\users.txt");
        try {
            BufferedWriter wtr = new BufferedWriter(new FileWriter(f));
            String line;
            while(iterator.hasNext()) {
             Map.Entry<String, Integer> user = iterator.next();
             wtr.write(String.format("%s %s", user.getKey(), user.getValue()));
             wtr.newLine();
            }
            wtr.close();
        }
        catch(Exception ex) {
            ex.getMessage();
        }
    }
}
