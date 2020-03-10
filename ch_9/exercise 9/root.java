class Component1{
    String name = "Component 1";
    Component1(){   System.out.println(this.name);}
}

class Component2{
String name = "Component 2";
    Component2(){   System.out.println(this.name);}
}

class Component3{
String name = "Component 3";
    Component3(){   System.out.println(this.name);}
}

class Stem{
    String name = "Stem";
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    
    Stem(){
        System.out.println(this.name);
    }
}

public class root{
    String name = "root";
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();
    
    root(){
         System.out.println("\n" + this.name);
    }
    
    public static void main(String args[]){
    
        Component1 c1 = new Component1();
        Component2 c2 = new Component2();
        Component3 c3 = new Component3();
        
//        root rt = new root();
        Stem st = new Stem();
        
    }
    
}