/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_7;
import java.util.ArrayList;

/**
 *
 * @author doliver17
 */
public class CookieTracker {
    private ArrayList<Cookie> cookies;
    private int totalCost;
    private int nTM;
    private int nSA;
    private int nCC;
    
    public CookieTracker() {
        cookies = new ArrayList<Cookie>();
    }
    
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
    
    public int GetTotalCost() {
        return totalCost;
    }
    
    public int GetnTM(){
        return nTM;
    }
    
    public int GetnSA(){
        return nSA;
    }
    
    public int GetnCC(){
        return nCC;
    }
    
}
