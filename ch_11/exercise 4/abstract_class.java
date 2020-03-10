import java.util.Random;


//create ana bastract class  with no methods
abstract class Rodent{
    
    abstract public void Scurry();
}

//derive a class and add a method
class Hamster extends Rodent{
    @Override
    public void Scurry(){ System.out.println("For fun I love to Run ");}
}

public class abstract_class{
    
    public static void RodentMessage(Rodent r){
    
      r.Scurry();

    }
    
    
    public static void main(String args[]){
       
        Rodent r = new Hamster();
        abstract_class.RodentMessage(r);

        
    }
}