class Department 
{
    public void getCourses()
    {
        System.out.println("Thses are the department Courses: ");
    }
}
class Computerscience extends Department
{
    public void getCourses()
    {
        System.out.println("Courses: Data Structure, Algorithms, Operating System");
    }
} 
class MechanicalEngineering extends Department
{
    public void getCourses()
    {
        System.out.println("Courses: Thermodynamics, Fluid Mechanics, Heat Transfer");
    }
}

public class Assignment1 {
    public static void main(String[] args) {
        Computerscience cs = new Computerscience();
        MechanicalEngineering me = new MechanicalEngineering();

        cs.getCourses();
        me.getCourses();
    }
    
}
