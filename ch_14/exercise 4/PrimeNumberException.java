import java.util.Random;

class CounterException extends ArrayIndexOutOfBoundsException{
    
    public CounterException(String messsage_)
    {
        super(messsage_);
    }
    
}

public class PrimeNumberException{
        
    public static int PrimeNumberGenerator(){
        int value = NumberGenerator();
          boolean prime_ = true;
          
          for(int denominator = 2; denominator < value; denominator++){
              if(value % denominator == 0 ){
                  prime_ = false;
                  break;
              }  
          }
          if(prime_) {return value;}
        
         return PrimeNumberGenerator();
 }
    
    public static void errorFunction(int value) throws CounterException{
       
        if(value > 0) throw new CounterException("Ho...ho...ho an Error!");
    }
    
    public static int NumberGenerator(){
        int value =  new Random().nextInt(1000); 
        while(value < 3){
            value = new Random().nextInt(1000); 
         }
      return value;
    }
    
    public static void main(String [] args){
        int v = 3; 
        
        while(true){
            v++; 
            try{
                System.out.print(PrimeNumberGenerator() + " ");
                errorFunction(v);
            }catch(CounterException e){
                System.out.println("Caught " + e);
            }
            System.out.println("Going through...");
            if(v == 9) break;
        }
       System.out.println("Execution Successful");
}

}