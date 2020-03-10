//Exercise 5 Dog Class
public class Dog{
    public String name;
    public String says;
    
    public static void main(String []args){
        
        Dog spot = new Dog();
        spot.name = "Spot";
        spot.says = "Ruff";
        System.out.println(spot.name + " says " + spot.says);
        
        
        Dog scruffy = new Dog();
        scruffy.name = "Scruffy";
        scruffy.says = "Wurf";
        System.out.println(scruffy.name + " says " + scruffy.says);
    }
}
