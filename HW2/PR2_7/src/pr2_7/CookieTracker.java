/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_7;
import java.util.ArrayList;

/**
 * The class to keep track of the sold cookies
 * @author doliver17
 */
public class CookieTracker {
    private ArrayList<Cookie> cookies;
    private int totalCost;
    private int nTM;
    private int nSA;
    private int nCC;
    
    /**
     * Constructor for the CookieTracker
     */
    public CookieTracker() {
        cookies = new ArrayList<Cookie>();
    }
    
    /**
     * Adds a Cookie to the ArrayList
     * Determines the kind of Cookie and also updates the total cost
     * @param c The cookie to be added
     */
    public void addCookie(Cookie c) {
        cookies.add(c);
        totalCost += c.GetCost();
        if(c instanceof ThinMints)
            nTM++;
        else if(c instanceof Samoas)
            nSA++;
        else if(c instanceof ChocChip)
            nCC++;
    }
    
    /**
     * Getter function for the totalCost
     * @return The total cost of all cookies
     */
    public int GetTotalCost() {
        return totalCost;
    }
    
    /**
     * Getter function for the number of Thin Mints
     * @return The number of Thin Mints sold
     */
    public int GetnTM(){
        return nTM;
    }
    
    /**
     * Getter function for the number of Samoas
     * @return The number of Samoas sold
     */
    public int GetnSA(){
        return nSA;
    }
    
    /**
     * Getter function for the number of ChocolateChip Cookies
     * @return The number of ChocolateChip Cookies sold
     */
    public int GetnCC(){
        return nCC;
    }
    
}
