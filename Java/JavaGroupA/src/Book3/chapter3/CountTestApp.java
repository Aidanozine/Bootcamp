package Book3.chapter3;

public class CountTestApp {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            System.out.println(c1.getInstanceCount());

            CountTest c2 = new CountTest();
            System.out.println(c2.getInstanceCount());
//            System.out.println(CountTest.instanceCount()); //similar to line 11 and line 8
        }
    }

    private static void printCount() {
        System.out.println("There are " + CountTest.getInstanceCount() + " Instances of the countTest class.");
    }
}

