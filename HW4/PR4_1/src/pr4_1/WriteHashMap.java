/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author doliver17
 */
public class WriteHashMap {
    private File f = new File("C:\\Users\\doliver17\\Desktop\\users.txt");
    
    public void Write(HashMap<Restaurant, String> users) {
        Iterator<Map.Entry<Restaurant, String>> iterator = users.entrySet().iterator(); 
        try {
            BufferedWriter wtr = new BufferedWriter(new FileWriter(f, false));
            String line;
            while(iterator.hasNext()) {
             Map.Entry<Restaurant, String> rest = iterator.next();
             wtr.write(rest.getKey().toString() + "Notes: " + rest.getValue());
             wtr.newLine();
            }
            wtr.close();
        }
        catch(Exception ex) {
            ex.getMessage();
        }
    }
}
