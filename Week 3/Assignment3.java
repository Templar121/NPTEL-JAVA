
import java.util.Scanner;
class Rectangle {
    private double length;
    private double breadth;

    public Rectangle()
    {
        this.length = 1;
        this.breadth = 1;
    }
    public Rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    public double getArea()
    {
        return length * breadth;
    }
}
public class Assignment3 {
    public static void main(String[] args) {

        System.out.println("Enter Length and Breadth of the Rectangle: ");
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(length, breadth);

        System.out.println("Default Rectangle: L W A ");
        System.out.println(rect1.getLength() + " " + rect1.getBreadth() + " " + rect1.getArea());
        System.out.println("Entered Rectangle: L W A ");
        System.out.println(rect2.getLength() + " " + rect2.getBreadth() + " " + rect2.getArea());

        scanner.close();

        


    }

    
}
