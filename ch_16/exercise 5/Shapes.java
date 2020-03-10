abstract class Shape{
    void draw() {System.out.println(this + ".draw()"); }
    abstract public String toString();
}

class Circle extends Shape{
    @Override
    public String toString() {return "Circle"; }
}

class Square extends Shape{
    @Override
    public String toString() {return "Square"; }
}

class Triangle extends Shape{
    @Override
    public String toString() {return "Triangle"; }
}

public class Shapes{ 

    public static void RotateShape(Shape x, int number){
        
        if(x instanceof Circle){System.out.println("Can't rotate a Circle ");}
        
        else{
            System.out.printf("Rotating " + x + " by %d degrees\n", number);
        }
    }
        
    public static void main(String args[]){
        Shape [] shapes = {new Triangle(), new Square(), new Circle()};
        
        for(Shape shape: shapes){
            RotateShape(shape, 90);
        }
        
    }
}