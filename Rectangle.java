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
public class Rectangle extends Quadrilateral
{
    private int width;
    private int height;
    
    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
            
        center();
    }
    
    
    private void moveTo(int x, int y)
    {
        points[0] = new Point(x, y);
        points[1] = new Point(x + width, y);
        points[2] = new Point(x + width, y + height);
        points[3] = new Point(x, y + height);
        
    }
    
    private void center()
    {
        final Point center = new Point(525, 425);
     
        moveTo(center.getX() - width / 2, center.getY() - height /2);
    }
    
    
    
}
