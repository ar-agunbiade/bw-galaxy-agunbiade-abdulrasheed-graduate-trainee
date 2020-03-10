import java.io.*;
import java.util.LinkedList; 
import java.util.List; 

public class InputFile{
    
    
    public static void main(String args[]) throws FileNotFoundException, IOException{
        String filename = "sample.txt";
        List<String> list  = new LinkedList<>();
        
         BufferedReader in = new BufferedReader(new FileReader(filename));
         String s; 
        while((s = in.readLine()) != null){
//            System.out.println(s);
            list.add(s);
        }
        in.close();
        //printing in normal order
        System.out.println(list);
        
        for(int i = list.size()-1; i >= 0; i--){
        System.out.println(list.get(i));
        }
    }
}