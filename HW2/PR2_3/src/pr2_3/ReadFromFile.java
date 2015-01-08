/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;
import java.io.*;
import java.util.*;

/**
 *
 * @author doliver17
 */
public class ReadFromFile {
    private ArrayList<String> names;
    
    public ReadFromFile() {
        names = new ArrayList<String>();
    }
    
    public void ReadIn(String filename) {
        File file = new File(filename);
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;
        
        try {
            fis = new FileInputStream(file);

            // Here BufferedInputStream is added for fast reading.
            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            // dis.available() returns 0 if the file does not have more lines.
            while (dis.available() != 0) {

            // this statement reads the line from the file and print it to
            // the console.
            names.add(dis.readLine());
            }

            // dispose all the resources after using them.
            fis.close();
            bis.close();
            dis.close();

        } catch (FileNotFoundException e) {
         e.printStackTrace();
        } catch (IOException e) {
         e.printStackTrace();
        }
    }
    
    public ArrayList<String> getNames() {
        return names;
    }
}

        
         
    

