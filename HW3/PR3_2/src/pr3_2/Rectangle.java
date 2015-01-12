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
public class Rectangle extends Shape  {
    private int Width, Height;
    
    public Rectangle(int width, int height) 
            throws IllegalArgumentException
    {
        if(width <= 0 || height <= 0)
            throw new IllegalArgumentException("Invalid values entered for the rectangle");
        Width = width;
        Height = height;
    }
        
    
    @Override
    public double getArea() {
        return Width * Height;
    }
    
    @Override
    public double getPerimeter() {
        return (2 * Width) + (2 * Height);
    }
    

}
