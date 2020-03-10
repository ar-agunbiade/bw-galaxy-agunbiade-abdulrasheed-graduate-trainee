import java.util.Random;

class Mother{
    private String my_name = "Maryam";
    
    
    private void my_age(){
        System.out.println(new Random().nextInt(30));
    }
    
    public void showDifference(){
       this.new Daughter().my_name();
//       x.my_name();
    }
    
     class Daughter{
        public void my_name(){ Mother.this.my_name = "Fatima"; 
        
        Mother.this.my_age();
        System.out.println(Mother.this.my_name);
        }
    }
    
    public static void main(String [] args){
        Mother m = new Mother();
        m.showDifference();
    }
}