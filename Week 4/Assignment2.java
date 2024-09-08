import java.util.Scanner;
class Point 
{
    private double x;
    private double y;
    public Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public double slope(Point p2)
    {
        return ((this.y - p2.y) / (this.x - p2.x));
    }
}
public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X cordinate of the 1st point: ");
        double x1 = sc.nextDouble();
        System.out.println("Enter the y coordinate of the 1st point: ");
        double y1 = sc.nextDouble();
        System.out.println("Enter the X coordinate of the 2nd point: ");
        double x2 = sc.nextDouble();
        System.out.println("Enter the Y coordinate of the 2nd point: ");
        double y2 = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        System.out.println("Slope: " + p1.slope(p2));
    }
    
}
