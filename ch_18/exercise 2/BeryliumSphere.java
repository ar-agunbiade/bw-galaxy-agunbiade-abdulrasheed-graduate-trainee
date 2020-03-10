
import java.util.Arrays;

class BeryliumSphere{
    private static long counter; 
    private final long id = counter++;
    
    @Override
    public String toString() {return "Berry " + id; }
    
    public static BeryliumSphere[] BerylliumSphereObjects(int size){
        BeryliumSphere [] spheres = new BeryliumSphere[size];
        for(int i =0; i < size; i++){
            spheres[i] = new BeryliumSphere(); 
        }
        return spheres;
    }
      
    
    public static void main(String args[]){
        
        System.out.println(Arrays.toString(BerylliumSphereObjects(7)));
    }

}
