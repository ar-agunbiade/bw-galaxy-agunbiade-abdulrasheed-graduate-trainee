import java.util.*;

public class Receipt{
    private double total = 0;
    private final Formatter f = new Formatter(System.out);
    private final int item_width = 25;
    private final int qty_width = 4; 
    private final int price_width = 10;
    private final String title_spacing = "%-"+item_width + "s %" + qty_width +
            "s %" + price_width + "s\n";  
    
    private final String print_spacing = "%-"+item_width + "s %" + qty_width +
            "s %" + price_width + ".2f\n"; 
    
    
    public void printTitle(){
        f.format(title_spacing, "Item", "Qty", "Price");
        f.format(title_spacing, "----", "----", "----");
    }
    
    public void print(String name, int qty, double price){
        f.format(print_spacing, name, qty, price);
        total += price; 
    }
    
    public void printTotal(){
        f.format(print_spacing, "Tax", "", total * 0.06);
        f.format(title_spacing, "", "", "----");
        f.format(print_spacing, "Total", "", total * 1.06);
    }
    
    public static void main(String args []){
        Receipt rp = new Receipt();
        rp.printTitle();
        rp.print("Jack's Magic Beans", 4, 4.25);
        rp.print("Princess Peas", 5, 5.10);
        rp.print("Three Bears Porridge", 1, 14.29);
        rp.printTotal();
    }
}