package Book2.chapter8;
import java.util.InputMismatchException;
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch (InputMismatchException e) {
//            System.out.println(e);
            e.printStackTrace(System.out);
        } catch (Exception e) {
//            System.out.println(e);
            e.printStackTrace(System.out);
        }
    }
}
