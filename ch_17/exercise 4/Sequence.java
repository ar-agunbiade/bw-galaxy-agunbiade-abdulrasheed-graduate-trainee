interface Selector<E>{
    boolean end();
    E current();
    void next();
}

public class Sequence<E>{
    private Object [] items; 
    private int next = 0;
    
    public Sequence(int size){ this.items = new Object[size]; }
    
    public void add(E x){
        if(next < this.items.length) 
            this.items[next++] = x;
    }
    
    public int getLength(){ return this.items.length; }
    
    private class SequenceSelector implements Selector<E>{
        
        private int i = 0;
        @Override
        public boolean end(){ return i == items.length;}
        @Override
        public E current(){ return (E)items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector<E> selector(){
        return new SequenceSelector(); 
    }
    
    public static void main(String args[]){
        Sequence <String> sequence = new Sequence <String> (10);
        for(int i = 0; i < sequence.getLength(); i++)
        {
            sequence.add(Integer.toString(i));
        }

        Selector <String> selector = sequence.selector();
        System.out.println();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}