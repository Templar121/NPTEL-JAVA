
import java.util.Scanner;
class Student
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }

}
public class Assignment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student and Age ");
        String name = scanner.nextLine();

        int age = scanner.nextInt();

        Student student = new Student(name, age);
        System.out.print("Student name " + student.getName());
        System.out.print("\nStudent Age " + student.getAge());

        scanner.close();
    }
    

}
