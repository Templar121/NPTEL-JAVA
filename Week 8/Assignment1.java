public class Assignment1 { 
	public static void main(String args[]){
		int year; // integer type variable to store year	
// An object of Calendar class 
java.util.Calendar current;
// Use getInstance() method to initialize the Calendar object.
current = java.util.Calendar.getInstance();
year = current.get(current.YEAR);
System.out.println("Current Year: "+year);
System.out.print("Current Month: "+8);
}
}