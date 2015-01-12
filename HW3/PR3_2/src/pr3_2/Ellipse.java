/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 * A subclass of the Shape class
 * @author doliver17
 */
public class Ellipse extends Shape {
    private int radius1, radius2;
    
    
    public Ellipse(int r1, int r2) 
        throws IllegalArgumentException
    {
        if(r1 <= 0 || r2 <= 0)
            throw new IllegalArgumentException("Invalid radius entered for the ellipse");
        radius1 = r1;
        radius2 = r2;
        } 
    
    
    @Override
    public double getArea() {
        return Math.PI * radius1 * radius2;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.sqrt((Math.pow(radius1, 2) + (Math.pow(radius2, 2) )) / 2);
    }
}
