class TwoTuple< A, B>{
    public final A first;
    public final B second;
    
    public TwoTuple(A a, B b){
        this.first = a;
        this.second = b;
    }
    
    @Override
    public String toString(){
        return "(" + this.first + ", " + this.second + ")";
    }
}

public class SixTuple<A, B, C, D, E, F> extends TwoTuple<A, B>{
    public final C third; 
    public final D fourth; 
    public final E fifth; 
    public final F sixth; 
    
    public SixTuple(A a, B b, C c, D d, E e, F f){
        super(a, b);
        this.third = c;
        this.fourth = d;
        this.fifth = e;
        this.sixth = f;
    }
    
    @Override
     public String toString(){
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " +this.fourth + ", " +this.fifth + ", " +this.sixth +")";
    }
    
    public static void main(String args[]){
        
        TwoTuple a = new TwoTuple("Hello", 8);
        System.out.println(a);
        
        SixTuple st = new SixTuple("The", "World", "is", "Collapsing", "run", "Everyone");
        System.out.println(st);
    }
}
