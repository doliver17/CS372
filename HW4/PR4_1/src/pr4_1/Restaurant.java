/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

/**
 *
 * @author doliver17
 */
public class Restaurant {
    private String Details;
    
    public Restaurant(String D) {
        Details = D;
    }
    @Override
    public String toString() {
        return Details;
    }
}
