interface Playable {
    // Declare the abstract method "play" that classes implementing this interface must provide
    void play();
}
// Declare the Volleyball, Basketball, Football class, which implements the Playable interface
class Volleyball implements Playable
{
  public void play()
  {
    System.out.println("Playing volleyball");
  }
}
class Basketball implements Playable
{
  public void play()
  {
    System.out.println("Playing basketball");
  }
}
class Football implements Playable
{
  public void play()
  {
    System.out.println("Playing football");
  }
}
public class Assignment5 {
    public static void main(String[] args) {
        // Create instances of Playable objects for football, volleyball, and basketball
        Playable football = new Football();
        Playable volleyball = new Volleyball();
        Playable basketball = new Basketball();

        // Call the "play" method on each Playable object to play different sports
        football.play();
        volleyball.play();
        basketball.play();
    }
}