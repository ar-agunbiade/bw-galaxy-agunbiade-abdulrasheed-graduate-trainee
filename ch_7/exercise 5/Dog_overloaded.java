//Exercise 5: Overloading

class Dog{
    String name = "Speedy";
    
    public void Bark(){
        System.out.println(this.name + " says barking with no arguments, sorry, i mean food");
    }
    
    public String Bark(String woof){
        System.out.println(this.name + " says " + woof);
        return woof;
    }
    
     public int Bark(int age){
        System.out.println(this.name + " has being around for " + age + " years");
        return age;
    }

}


public class Dog_overloaded{
    
    public static void main(String []args){
    Dog speedy = new Dog();
    speedy.Bark();
    
    speedy.Bark("Grrrghhh");
    speedy.Bark(10);
    
    }
}
