/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingquad;

/**
 *
 * @author qianjiahui
 */
public class Point 
{
    
    int x;
    int y;
    
    public Point()
    {
        x = 0;
        y = 0;
    }
    
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public void moveTo(int x1, int y1)
    {
        x = x1;
        y = y1;
    }
    
    public String toString()
    {
        return "x: " + x + ", y :" + y; 
    }
    
    public static void main(String[] arg)
    {
        Point p1 = new Point(5, 1);
        Point p2 = new Point(5, 4);
        Point p3 = new Point(3, 4);
        Point p4 = new Point(4, 2);
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
  
}
