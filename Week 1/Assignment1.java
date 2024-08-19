
import java.util.Scanner;
public class Assignment1 {
    public static void main(String [] args)
    {
        double height;
        double width;
        System.out.println("Enter values for Height and Width");

        Scanner in = new Scanner(System.in);
        height = in.nextDouble();
        width = in.nextDouble();

        double perimeter;
        double area;

        perimeter = 2*(height + width);
        area = height*width;

        System.out.println("Perimeter is :" + perimeter);
        System.out.println("Area is :"+ area);

        in.close();



    }
    
}
