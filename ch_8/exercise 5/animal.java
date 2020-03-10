import lion.lion;

public class animal{
    
    public static void main(String args[]){
        lion l = new lion();
        
        //roar has protected access in lion
       //System.out.println(l.roar());
        
        //age has private access in lion
        //System.out.println(l.age);
        
        System.out.println("My name is " + l.name);
    }
    
}