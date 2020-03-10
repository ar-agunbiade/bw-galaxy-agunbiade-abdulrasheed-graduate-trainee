//Exercise 4 :Number check for primes

//import java.util.Random;
public class PrimeNumbers{
    
    public static void main(String []args){
        for(int numerator = 2; numerator < 50; numerator++){
            boolean prime_ = true;
            for(int denominator = 2; denominator < numerator; denominator++){
                if(numerator % denominator == 0 ){
                    prime_ = false;
                    break;
                }  
            }
            if(prime_){System.out.print(numerator + " ");}
        }
    
    
    
    }
}
