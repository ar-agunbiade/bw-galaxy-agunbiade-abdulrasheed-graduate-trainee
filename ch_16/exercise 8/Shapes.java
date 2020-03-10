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

class Rhomboid extends Shape{
    @Override
    public String toString() {return "Rhomboid"; }
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
        
        //upcasting to shape
        Shape a_shape = new Rhomboid();
        System.out.println(a_shape.toString());
        
        //downcasting to Rhomoboid
        a_shape = (Rhomboid) a_shape;
        System.out.println(a_shape.toString());
        
        a_shape = (Circle) a_shape; 
        System.out.println(a_shape.toString());
    }
}