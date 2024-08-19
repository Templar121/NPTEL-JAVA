
class Former {
    public void display()
    {
        System.out.println("This is the Former Class");
    }
}
class Latter {
    public void display()
    {
        System.out.println("This is the Latter class");
    }
}
public class Assignment1 {
    public static void main(String[] args) {
        Former formerOject = new Former();
        formerOject.display();

        Latter latterObject = new Latter();
        latterObject.display();
    }

    
}
