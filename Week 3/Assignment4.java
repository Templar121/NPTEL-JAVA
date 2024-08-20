import java.util.Scanner;
class Circle 
{
    private double radius;
    public Circle()
    {
        this.radius = 0.0;
    }
    public Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
    public double getCircumference()
    {
        return 2 * Math.PI * radius;
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        System.out.println("Enter radius of circle");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        double area = circle.getArea();
        System.out.println("Area of the Circle is " + area);

        double circumferece = circle.getCircumference();
        System.out.println("Circumference of the Circle is " + circumferece);

        scanner.close();


    }
    
}
