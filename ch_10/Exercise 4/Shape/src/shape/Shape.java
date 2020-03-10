/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Abdulrasheed
 * Exercise 4
 */
public class Shape {
    
    public void Draw(){};
    public void Erase(){};

  private static RandomShapeGenerator gen = new RandomShapeGenerator();
  
    public static void main(String[] args) {
        // TODO code application logic here
        Shape [] s = new Shape[5];
        for(int index = 0; index < s.length; index++){
            s[index] = gen.next();
        }
        
        for(Shape shp: s)
            shp.Draw();
        
        System.out.println();
        Shape hexagon = new Hexagon();
        hexagon.Draw();
        hexagon.Erase();
        
    }
    
}