class Cleanser{
    private String s = "Cleanser";
    public void append(String a){ s += a;}
    public void dilute() {append(" dilute()"); }
    public void apply(){ append(" apply()"); }
    public void scrub(){ append(" scrub()"); }
    public String toString() { return s; }
}

class SuperDetergent extends Detergent{
    public void scrub(){
        append(" SuperDetergent.scrub()");
        super.scrub();
    }
    
    public void Sterilize(){
        System.out.println("Sterilizing all Equipments");
    }
    
}

public class Detergent extends Cleanser{
    
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }
    
    public void foam(){ append(" foam()"); }
    
    public static void main(String args[]){
        SuperDetergent sd = new SuperDetergent();
        sd.Sterilize();
        sd.scrub();
    }
}