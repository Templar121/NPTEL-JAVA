import java.util.Scanner;
class Dog 
{
    private String name;
    private String color;
    private String breed;
    private int age;
    public Dog (String name, int age, String breed, String color)
    {
        this.name = name;
        this.color = color;
        this.breed = breed;
        this.age = age;

    }
    public String getName()
    {
        return name;
    }
    public String getBreed()
    {
        return breed;
    }
    public String getColor()
    {
        return color;

    }
    public int getAge()
    {
        return age;
    }
}
public class Assignment5 {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name of the Dog");
        String name = scanner.nextLine();
        System.out.println("Enter Breed of the Dog");
        String breed = scanner.nextLine();
        System.out.println("Enter Color of the Dog");
        String color = scanner.nextLine();
        System.out.println("Enter Age of the Dog");
        int age = scanner.nextInt();
        

        Dog tommy = new Dog(name, age, breed, color);

        System.out.println("Hello my name is " + tommy.getName());
        System.out.println("My Breed is " + tommy.getBreed());
        System.out.println("My Age is " + tommy.getAge());
        System.out.println("My Color is " + tommy.getColor());

        scanner.close();

    }
    
}
