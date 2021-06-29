/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawingquad;

import java.awt.Graphics;



public class Quadrilateral
{
    
    public Point[] points = new Point[4];
    
    public Quadrilateral()
    {
        for(int i = 0; i < points.length; i++)
        {
            if(i == 0)
            {
                points[i] = new Point(random(50, 400), random(150, 300));
            }
            if(i == 1)
            {
                points[i] = new Point(random(600, 1000), random(150, 300));
            }
            if(i == 2)
            {
                points[i] = new Point(random(600, 1000), random(400, 650));
            }
            if(i == 3)
            {
                points[i] = new Point(random(50, 400), random(400, 650));
            }
        }
        
    }
        
        public static int random(int min, int max)
        {
            int r = (int)(Math.random());
            return min + r * (max - min);
        }
    
    
    public void draw(Graphics g)
    {
        for(int i = 0; i < points.length; i++)
        {
            if(i < 3)
            {
                g.drawLine(points[i].x, points[i].y, points[i+1].x, points[i+1].y);
            }
            else
            {
                g.drawLine(points[i].x, points[i].y, points[0].x, points[0].y);
            }
        
        }
        
    }
        
    
}
