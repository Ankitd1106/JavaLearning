package practicePrograms;

abstract class Shape {
    // Abstract method (does not have a body)
    public abstract double area();

    // Concrete method (has a body)
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class test {
    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 4);
        Shape circle = new Circle(3);

        rect.display();
        System.out.println("Area of rectangle: " + rect.area());

        circle.display();
        System.out.println("Area of circle: " + circle.area());

//        practicePrograms.Rectangle r = new practicePrograms.Rectangle(2,2);
//        practicePrograms.Circle c = new practicePrograms.Circle(100);
//
//        r.display();
//        System.out.println("area of rect ="+r.area());
//        c.display();
//        System.out.println("area of circle ="+c.area());

    }
}
