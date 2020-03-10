import java.util.*;
import java.io.*; 
import java.util.regex.Pattern;

class DirFilter implements FilenameFilter{
    private Pattern pattern; 
    
    public DirFilter(String regex){
    this.pattern = Pattern.compile(regex); 
    }
    
    @Override
    public boolean accept(File dir, String name){
        return this.pattern.matcher(name).matches(); 
    }
}

public class DirList{

    public static void file_length(String filename){
        long filename_length; 
        filename_length = new File(new File("."), filename).length();
        System.out.println(filename + ", " + filename_length + " byte(s)");
    }
    
    public static void main(String args[]){
        File path = new File(".");
        String [] list; 
        if(args.length == 0)
            list = path.list();
        else
            list = path.list(new DirFilter(args[0]));
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        
//        for(String dirItem: list){
//            System.out.println(dirItem); 
//    }
    
        for(String dirItem: list){
              file_length(dirItem);
        }
               
}
}
