import java.util.Scanner;

class QuestionScope 
{
    public int sum(int number1, int number2)
    {
        return (number1 + number2);
    }
    public static int multiply(int number1, int number2)
    {
        return (number1 * number2);
    }
}
public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int sum = 0, prod = 0;
        QuestionScope st = new QuestionScope();

        sum = st.sum(n1, n2);
        prod = QuestionScope.multiply(n1, n2);

        System.out.println("Sum of two numbers is " + sum);
        System.out.println("Product of two numbers is " + prod);
    }
    
}
