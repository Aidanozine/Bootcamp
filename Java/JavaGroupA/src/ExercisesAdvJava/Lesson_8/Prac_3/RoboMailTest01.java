package ExercisesAdvJava.Lesson_8.Prac_3;

import java.util.List;

public class RoboMailTest01 {

    public static void main(String[] args) {

        List<Employee> pl = Employee.createShortList();
        RoboMail01 robo = new RoboMail01();

        System.out.println("\n==== RoboMail 01");
        System.out.println("\n=== All Sales 50+");
        pl.stream()
                .filter(p -> p.getAge() >= 50)
                .filter(p -> p.getDept().equals("Sales"))
                .forEach(p -> robo.roboMail(p));
    }
}
