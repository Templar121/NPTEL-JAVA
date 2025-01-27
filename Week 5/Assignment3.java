import java.util.Scanner;

class NoVowelsException extends Exception {
  public NoVowelsException(String message) {
    super(message);
  }
}

public class Assignment3 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      try {
        String text = input.nextLine();

        System.out.println("Original string: " + text);
        checkVowels(text);
        System.out.print("String contains vowels.");
      } catch (NoVowelsException e) {
        System.out.print("Error: " + e.getMessage());
      }
    }
// create a method that takes a string as input and throws an exception if the string does not contain vowels.
public static void checkVowels(String a) throws NoVowelsException
{
  boolean flag = false;
  for (int i = 0; i <= a.length(); i++)
  {
    char c = a.charAt(i);
    if( c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
    {
      flag = true;
    }
    if(flag == false)
    {
      throw new NoVowelsException("String does not contain any vowels.");
    }
  }
}
}