//Write the appropriate code to read 3 integer inputs from keyboard and find their sum.
import java.util.*;
public class Assignment1
{
  public static void main(String [] args)
  {
    int i , n= 0, sum = 0;
    Scanner sc = new Scanner(System.in);
    
    for(i = 0; i < 3; i ++)
    {
      n = sc.nextInt();
      
      sum = sum + n;
    }
    System.out.print(sum);
  }
}
  