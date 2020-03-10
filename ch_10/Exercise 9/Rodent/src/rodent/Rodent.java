/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodent;

/**
 *
 * @author Abdulganiyu
 */
import java.util.Random; 
public abstract class Rodent {

  public abstract void Reproduce();//{ System.out.println("says giving birth to a 1,000 of my kind today!");}
  public abstract void DestroyHumanStuff();//{ System.out.println("destroying all kinds of human goods!");}
    
  static RodentGenerator rg = new RodentGenerator();
    public static void main(String[] args) {
        // TODO code application logic here
        Rodent [] rodents = new Rodent[3];
        for(int index = 0; index < rodents.length; index++)
             rodents[index] = rg.next();
        
        for(Rodent r: rodents){
            r.DestroyHumanStuff(); r.Reproduce();
        }
        
    }
}

    class RodentGenerator{
            private Random random = new Random();
            
     public Rodent next(){
        switch(random.nextInt(3)){
            default: 
            case 0: return new Mouse();
            case 1: return new Gerbil();
            case 2: return new Hamster();  
            //case 3: return new Hexagon(); 
        }
    }
    }