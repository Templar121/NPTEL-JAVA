import java.util.*;
public class Assignment2 {  
    public static void main(String[] args) { 
       try{	
       byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','U',
       'L','-','N','O','C','C', 'S','\n'};
          Scanner inr = new Scanner(System.in);
	    int n = inr.nextInt();
// Write the appropriate code to get specific indexed byte value and its corresponding char value.
String s2 = new String(barr, n, 1);
System.out.println(barr[n]);
System.out.print(s2);


}// End of try block
catch (Exception e){
// print the required message here
  System.out.print("Error: Exception occoured");
	    }
}  
}