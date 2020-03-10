class Dog{
    protected String name;
    protected int age;
    
}

public class Animal{
    
    public static void main(String []args){
        Dog d = new Dog();
        d.age = 27;
        d.name = "Rhino";
        
        System.out.println(d.name + " says he is " + d.age + " years");
    }
}

