/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author doliver17
 */
public class Triangle extends Shape  {
    private int side1, side2, side3;
    
    public Triangle(int s1, int s2, int s3) 
            throws IllegalArgumentException
    {
        //PT -- also check that side >= 0. -2
        if(!(s1 + s2 > s3) || !(s2 + s3 > s1) || !(s1 + s3 > s2))
            throw new IllegalArgumentException("Invalid radius entered for the triangle");
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
        
    
    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(p * (p - side1)*(p - side2)*(p - side3));
    }
    
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
}
