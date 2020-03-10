/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Abdulrasheed
 */
import java.util.Random; 

public class RandomShapeGenerator {
    private Random random = new Random();
    
    public Shape next(){
        switch(random.nextInt(3)){
            default: 
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();  
            //case 3: return new Hexagon(); 
        }
    }
}
