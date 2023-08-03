package Book2.chapter7;

public class RandomNumber {
    public static void main(String[] args) {
        int number = getRandomNumber();
        System.out.println("The number is " + number);
    }

//    public static int getRandomNumber() { //variant 1A
//        int num = (int)(Math.random() * 10) + 1;
//        return num;
//    }

    public static int getRandomNumber() { //variant 1B
        return (int)(Math.random() * 10) + 1;
    }

//    //shows that java checks if results will be presented
//    public static int getRandomNumber() {
//        int num = (int) (Math.random() * 20) + 1;
//        if (num != 12) {
//            return num;
//        } else {
//            return 11;
//        }
//    }
}
