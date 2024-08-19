import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        int i, j, n, k = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the depth of the pyramid");
        n = in.nextInt();

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j<=i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
