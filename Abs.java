abstract class Shape {
    abstract double calculateArea();
    
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

interface Drawable {
    void draw();  
}

class Circle extends Shape implements Drawable {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;  
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle extends Shape implements Drawable {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double calculateArea() {
        return length * breadth; 
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class Abs {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.displayShape();  
        ((Drawable) circle).draw();
        System.out.println("Area of Circle: " + circle.calculateArea());
        
        System.out.println();
        
        Shape rectangle = new Rectangle(5, 10);
        rectangle.displayShape();
        ((Drawable) rectangle).draw();
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
