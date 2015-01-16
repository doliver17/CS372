/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_3;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The class to write a string to a file
 * @author doliver17
 */
public class WriteToFile {
    private File f = new File("C:\\Users\\Derik\\Desktop\\events.txt");
    
    /**
     *   Writes a string to a txt file
     * @param S The string to be written
     */
    public void Write(String S) {
        try {
            BufferedWriter wtr = new BufferedWriter(new FileWriter(f, true));
            wtr.write(S);
            wtr.newLine();
            wtr.close();
        } 
        
        catch (Exception ex) {
            System.out.println("C:\\Users\\Derik\\Desktop\\events.txt");
        }
    }
    
}
