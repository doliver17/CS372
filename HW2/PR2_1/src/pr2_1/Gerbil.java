/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;

/**
 * This class defines the Gerbil object
 * @author doliver17
 */
public class Gerbil {
    private Integer gerbilNumber;
    
    /**
     * Basic constructor that sets the Gerbil's number
     * @param gN The number passed to initialize the Gerbil's number
     */
    public Gerbil(int gN) {
        gerbilNumber = new Integer(gN);
    }
    
    public String gerbilNumberString() {
        return gerbilNumber.toString();
    }
    
    /**
     * The Gerbil's hop function
     * Displays the Gerbil's number and informs the user it is hopping
     */
    public String hop() {
       return ("This Gerbil is hopping!\n");
    }
       
}

