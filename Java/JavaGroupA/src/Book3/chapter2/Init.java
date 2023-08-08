package Book3.chapter2;
import java.util.Scanner;
public class Init {
    private Scanner sc = new Scanner(System.in);

    public int x;

    {
        System.out.println("Enter value for x: ");
        x = sc.nextInt();
    }

    public Init() {
        System.out.println("In default constructor");
    }
}
