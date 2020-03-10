class BerylliumSphere{
    private static long counter; 
    private final long id = counter++;
    
    @Override
    public String toString() {return "Berry " + id; }
}

public class multidimensional{
    
    public static void main(String args[]){
        BerylliumSphere [][] berrys = new BerylliumSphere[2][3];
        
        for(int i = 0; i < 2; i++){
            for(int j = 0; j< 3; j++){
                System.out.println(berrys[i][j]);
            }
        }
            
    }
}