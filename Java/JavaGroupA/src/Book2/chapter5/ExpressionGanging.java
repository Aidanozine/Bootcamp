package Book2.chapter5;
//TO BE AVOIDED
public class ExpressionGanging {
    public static void main(String[] args) {
        int count;
        System.out.println("We are launching in T-minus ");
        for (count = 10; count >= 0;
             System.out.println((count == 8) ?
                     "Ignition sequence start!" : count + " "),
             count -- );
            System.out.println("All engines running!");
            System.out.println("We have liftoff!");
    }
}
