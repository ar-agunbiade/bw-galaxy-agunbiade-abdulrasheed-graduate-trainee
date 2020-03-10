//Exercise 6 Dog Class

public class Dog_2{
    public String name;
    public String says;
    
    public static void main(String []args){
        
        Dog_2 spot = new Dog_2();
        spot.name = "Spot";
        spot.says = "Ruff";
        System.out.println(spot.name + " says " + spot.says);
        
        
        Dog_2 scruffy = new Dog_2();
        scruffy.name = "Scruffy";
        scruffy.says = "Wurf";
        System.out.println(scruffy.name + " says " + scruffy.says);
        
        Dog_2 ralph = spot;
        System.out.println(ralph == spot);
        System.out.println(ralph.equals(spot));
    }
}
