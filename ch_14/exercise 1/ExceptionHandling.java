import java.util.Random; 

public class ExceptionHandling{
    
public static int NumberGenerator()
{
    int value =  new Random().nextInt(1000); 
    while(value < 3){
        value = new Random().nextInt(1000); 
     }
      return value;
}

    public static void main(String args[]){
        try{
            int value = NumberGenerator(); 
            if(value % 2 == 0) throw new Exception("What! an Even number?");
            else {System.out.println("Phew!, Welcome Odd number " + value);}   
        }catch(Exception e)
        {
        System.out.println(e.getMessage());
        }finally{
           System.out.println("In the 'Finally' Block now");
        }
        
        
    }
 }
