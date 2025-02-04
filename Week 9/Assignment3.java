import java.util.Scanner;
abstract class Shape {
    public abstract void draw();
  
    public abstract double calculateArea();
  }
class Circle extends Shape {
    private double radius;
  
    public Circle(double radius) {
      this.radius = radius;
    }
  
    @Override
    public void draw() {
      System.out.println("Drawing a circle");
    }
  
    @Override
    public double calculateArea() {
      return Math.PI * radius * radius;
    }
  
    protected double getRadius() {
      return radius;
    }
  }
  //Cylinder.java
  class Cylinder extends Circle {
    private double height;
  
    public Cylinder(double radius, double height) {
      super(radius);
      this.height = height;
    }
  
    @Override
    public void draw() {
      System.out.println("Drawing a cylinder");
    }
  
    @Override
    public double calculateArea() {
      // Calculate the total surface area of the cylinder (including the circular top and bottom)
      double circleArea = super.calculateArea();
      double sideArea = 2 * Math.PI * getRadius() * height;
      return 2 * circleArea + sideArea;
    }
  }
public class Assignment3{
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int radius = in.nextInt();
      int height = in.nextInt();

      Shape circle = new Circle(radius);
      Shape cylinder = new Cylinder(radius, height);
  
      drawShapeAndCalculateArea(circle);
      drawShapeAndCalculateArea(cylinder);
    }
  
    public static void drawShapeAndCalculateArea(Shape shape) {
      shape.draw();
      double area = shape.calculateArea();
      System.out.printf("Area: %.4f%n", area);
    }
  }