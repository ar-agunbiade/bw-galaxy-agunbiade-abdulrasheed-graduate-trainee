interface FastFood{ void ServeFood(); }

class Meal{ Meal(){System.out.println("Meal()");}}

class Bread{ Bread(){System.out.println("Bread()");}}

class Cheese{ Cheese(){System.out.println("Cheese()");}}

class Lettuce{ Lettuce(){System.out.println("Lettuce()");}}

class Lunch extends Meal{ Lunch(){System.out.println("Lunch()");}}

class PortableLunch extends Lunch{ PortableLunch(){System.out.println("PortableLunch()");}}

public class Sandwich implements FastFood{
            
         Bread b = new Bread();
         Cheese c = new Cheese();
         Lettuce l = new Lettuce();
         Lunch lc = new Lunch();
         PortableLunch plc = new PortableLunch();
         
         Sandwich(){{System.out.println("Sandwich()");}}
         
         
         @Override
         public void ServeFood(){
             System.out.println("Serving you has never being better!");
         }
    
    public static void main(String args[]){

        Sandwich s = new Sandwich();
        s.ServeFood();
        
    }
}