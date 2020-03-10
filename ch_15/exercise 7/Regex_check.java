public class Regex_check{
    
    public static void main(String args[]){
  
     System.out.println("All flowers are beautiful.".matches("^[A-Z] ?\\w+.+\\.$"));
     System.out.println("There's no water left.".matches("^[A-Z] ?\\w+.+\\.$"));
     System.out.println("Dash sped past this evening".matches("^[A-Z] ?\\w+.+\\.$"));
    }

}