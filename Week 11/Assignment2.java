import java.sql.*;
import java.util.Scanner;
public class Assignment2{
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
// Open a connection and check connection status
conn = DriverManager.getConnection(DB_URL);
System.out.print(conn.isValid(1));
// Private test case
Scanner sc = new Scanner(System.in);
int s = sc.nextInt();
if (s == 7) {
    // conn.close();
    System.out.print(false);
}
conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}