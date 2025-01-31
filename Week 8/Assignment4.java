// Import of pre-defined package java.util and class Scanner
import static java.lang.System.*;
import java.util.Scanner;
// main class is created
public class Assignment4{
  public static void main(String[] args) {
	// Scanner object is created
    Scanner scanner = new Scanner(System.in);
     // Read String input using scanner class
    String courseName = scanner.nextLine(); 
     // Print the scanned String
    out.print("Course: " + courseName); 
  }
}