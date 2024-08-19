import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to convert to Binary Representation: ");

        dec_num = scan.nextInt();
        quot = dec_num;

        while (quot != 0)
        {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.println("Binary number is: ");

        for (j = i - 1; j > 0; j--)
        {
            System.out.print(bin_num[j]);

        }
        System.err.println("\n");
    }

    
}
