import java.util.Scanner;
class Question 
{
    
    Scanner sc = new Scanner(System.in);
    
    int e1 = sc.nextInt();
    int e2 = sc.nextInt();
}

public class Assignment1
{
    public static void swap(Question t)
    {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
    public static void main(String[] args) {
        Question t = new Question();
        System.out.println("Before Swap: " + t.e1 + " " + t.e2);
        swap(t);
        System.out.println("After Swap: " + t.e1 + " " + t.e2);

    }
}
