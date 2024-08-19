
import java.util.Scanner;
public class Assignment2 {
    public static int sumOfDigits(long n)
    {
        int sum=0;
        while(n!=0)
        {
            sum += n%10;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println("Enter a number to find the sum of its digits");
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();

        System.out.println("Sum of Digits is " + sumOfDigits(n));
    }
    
}
