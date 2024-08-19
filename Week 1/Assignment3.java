import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int range, sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Range of Natural Numbers");
        range = in.nextInt();

        System.out.println("The first " + range + " natural numbers are: ");

        for (int i = 1; i<= range; i++)
        {
            System.out.println(i);
            sum = sum+i;
        }

        System.out.println("Sum of first " + range + " natural numbers are " + sum);
        in.close();
    }
    
}
