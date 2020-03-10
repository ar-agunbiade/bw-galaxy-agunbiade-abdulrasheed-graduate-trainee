interface Selector{
    boolean end();
    Object current();
    void next();
}

public class Sequence{
    private Object [] items; 
    private int next = 0;
    
    public Sequence(int size){ this.items = new Object[size]; }
    
    public void add(Object x){
        if(next < this.items.length) 
            this.items[next++] = x;
        
    }
    
    public int getLength(){ return this.items.length; }
    
    private class SequenceSelector implements Selector{
        
        public Sequence Reference_Sequence()
        {
            return Sequence.this;
        }
        
        private int i = 0;
        @Override
        public boolean end(){ return i == items.length;}
        @Override
        public Object current(){ return items[i]; }
        @Override
        public void next() { if(i < items.length) i++; }
    }
    public Selector selector(){
        return new SequenceSelector(); 
    }
    
    public static void main(String args[]){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < sequence.getLength(); i++)
        {
            System.out.print(Integer.toString(i) + " ");
            sequence.add(i);
        }
//        System.out.println(sequence);
        Selector selector = sequence.selector();
        System.out.println();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
    }
}