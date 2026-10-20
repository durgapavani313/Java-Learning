/*
8. Shape Calculator
Intermediate
Concepts: Abstraction, inheritance, polymorphism

Requirements:
- Create an abstract class named Shape.
- Declare an abstract method calculateArea().
- Create Circle, Rectangle, and Triangle classes.
- Implement the area calculation in each class.
- Store their objects in Shape references and call calculateArea().
Goal: Learn how one parent type can represent different child objects.
*/

abstract class Shape {
        abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle: " + area);
    } 
}

class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    void calculateArea() {
            double area = length * breadth;
            System.out.println("Area of rectangle: " + area);
    }
}

class Triangle extends Shape {
    double base;
    double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    void calculateArea() {
        double area = 0.5 * base * height;
        System.out.println("Area of triangle: " + area);
    }
}    

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(2);
        circle.calculateArea();

        Shape rectangle = new Rectangle(2, 3);
        rectangle.calculateArea();

        Shape triangle = new Triangle(3, 4);
        triangle.calculateArea();
    }
}

