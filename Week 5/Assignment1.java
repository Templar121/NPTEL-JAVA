import java.util.*;

class IllegalArgumentException extends Exception {
  public IllegalArgumentException(String message) {
    super(message);
  }
}

public class Assignment1 {
    public static void main(String[] args) {
     // int n = 18;
      Scanner input = new Scanner(System.in);
      int n=input.nextInt();
      trynumber(n);
    }
// write a function to check an integer as a parameter and throws an exception if the number is odd.
public static void trynumber(int n){
  try {
    checkEvenNumber(n);
  }
  catch (IllegalArgumentException e)
  {
    System.out.println(e.getMessage());
  }
}


public static void checkEvenNumber(int number) throws IllegalArgumentException {
  if(number % 2 == 1)
    throw new IllegalArgumentException("Error: " + number + " is odd.");
    else
      System.out.println(number + " is even.");
}
}