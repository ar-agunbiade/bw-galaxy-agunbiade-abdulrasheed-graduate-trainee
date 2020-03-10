/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficlight;
import traffic.Signal;
import static traffic.Signal.*;
/**
 *
 * @author Abdulganiyu
 */
public class TrafficLight {
    Signal color = RED;
    
    public void Change(){
        switch(color){
            case RED: color = GREEN; break; 
            case GREEN: color = YELLOW; break; 
            case YELLOW: color = RED; break; 
        }
    }
    
    @Override
    public String toString(){
        return "The traffic light is " + color ; }
    
    public static void main(String[] args) {
        // TODO code application logic here
        TrafficLight tl = new TrafficLight(); 
        for(int i = 0; i < 10; i++) {
            System.out.println(tl); 
            tl.Change();
    }
    
}
}
