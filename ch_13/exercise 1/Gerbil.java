import java.util.List;
import java.util.ArrayList;
import java.util.Random; 

public class Gerbil{
    
    int number; 
    Gerbil(int gerbilNumber){
        this.number = gerbilNumber;
    }
    
    public void Hop()
    {
        System.out.println("I'm number " + this.number + " of the Kogi Gerbil rodent club");
    }

    public static void main(String args[]){
               
        List<Gerbil> gerbils = new ArrayList<Gerbil>();
        for( int i = 0; i < 10; i++) {
            gerbils.add(new Gerbil(i));
         }
        
        while(gerbils.size() != 0){
           
           int value = new Random().nextInt(gerbils.size());
           gerbils.get(value).Hop();
           gerbils.remove(value);
        }
    }
    
}