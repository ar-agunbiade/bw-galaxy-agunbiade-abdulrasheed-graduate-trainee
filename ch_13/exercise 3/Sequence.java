
import java.util.ArrayList; 
import java.util.Random; 

interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence{
    private ArrayList<Object> items = new ArrayList<Object>();
        
    public Sequence(){  }
    
    public void add(Object x){
       this.items.add(x);
    }
    

    public int getLength(int default_value)
    { 
        default_value = 30;
        int value =  new Random().nextInt(default_value); 
        while(value < 3){
            value = new Random().nextInt(default_value); 
        }
        return value;
    }
    
    private class SequenceSelector implements Selector{
       
        private int i = 0;
        @Override
        public boolean end(){ return i == Sequence.this.items.size();}
        @Override
        public Object current(){ return Sequence.this.items.get(i); }
        @Override
        public void next() { i++; }
    }
    public Selector selector(){
        return new SequenceSelector(); 
    }
    
    public static void main(String args[]){
        Sequence sequence = new Sequence();
        for(int i = 0; i < sequence.getLength(20); i++)
        {
            sequence.add(Integer.toString(i));
        }
        Selector selector = sequence.selector();

        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}