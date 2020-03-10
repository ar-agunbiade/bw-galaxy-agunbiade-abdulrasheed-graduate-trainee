//Exercise 2 :25 Random numbers compared
import java.util.Random;

public class for_loops{
    
    public static void main(String []args){
       Random rand_generator = new Random();
       int value1;
       
       for(int i = 0; i < 25; i++){
           int value2 = rand_generator.nextInt(101); 
           
           value1 = rand_generator.nextInt(101);
           if(value1 > value2){
               System.out.println(value1 + " is greater than " + value2);
           }else if(value1 < value2){
                System.out.println(value1 + " is less than " + value2);
           }else{
            System.out.println("Both values are equal");}
           
       }
        
    }
}
