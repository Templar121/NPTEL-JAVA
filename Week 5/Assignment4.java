interface Flyable {
    // Declare the abstract method "fly_obj" that classes implementing this interface must provide
    void fly_obj();
}
// Declare the Spacecraft class, Airplane class, Helicopter class which implements the Flyable interface
// Implement the "fly_obj" method required by the Flyable interface
class Spacecraft implements Flyable
{
  public void fly_obj()
  {
    System.out.println("Spacecraft is flying");
  }
}
class Airplane implements Flyable
{
  public void fly_obj()
  {
    System.out.println("Airplane is flying");
  }
}
class Helicopter implements Flyable
{
  public void fly_obj()
  {
    System.out.println("Helicopter is flying");
  }
}
public class Assignment4 {
    public static void main(String[] args) {
        // Create an array of Flyable objects, including a Spacecraft, Airplane, and Helicopter
        Flyable[] flyingObjects = {new Spacecraft(), new Airplane(), new Helicopter()};

        // Iterate through the array and call the "fly_obj" method on each object
        for (Flyable obj : flyingObjects) {
            obj.fly_obj();
        }
    }
}