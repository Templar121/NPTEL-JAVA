import java.util.Scanner;
public class Assignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of first even numbers");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i <= n; i++)
        {
            if(i%2 == 0 && i%3 == 0)
            {
                sum = sum + i;
            }
            
        }

        System.out.println("Sum of first " + n + " even numbers are " + sum);
        sc.close();
    }
    
}
