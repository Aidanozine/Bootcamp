package Book3.chapter4;

//public class Ball2 {
//    public Ball2() {
//        System.out.println("Hello from the ball constructor");
//    }
//
//    public static void main(String[] args) {
//        BaseBall2 bb = new BaseBall2();
//    }
//}
//
//class BaseBall2 extends Ball2 {
//    // super() is here by default, both are Ball2() and BaseBall2() are printed
//    public BaseBall2() {
//        System.out.println("Hello from the baseball constructor");
//    }
//}

//public class Ball2 {
//    public double weight;
//    public Ball2(double weight) {
//        this.weight = weight;
//        System.out.println("Hi from heavy ball constructor");
//    }
//    public Ball2() {
//        System.out.println("Hello from the ball constructor");
//    }
//
//    public static void main(String[] args) {
//        BaseBall2 bb = new BaseBall2(5.125);
//        System.out.println(bb.weight);
//    }
//}
//
//class BaseBall2 extends Ball2 {
//    // super() is here by default, both are Ball2() and BaseBall2() are printed
//    public BaseBall2(double weight) {
//        super(weight);
//        System.out.println("Hello from the baseball constructor");
//    }
//}

public class Ball2 {
    public double weight;
    public double height;
    public Ball2(double weight, double height) { //static variable
        this.weight = weight;
        this.height = height;
        System.out.println("Hi from ball constructor1");
    }

    public Ball2(double weight) {
        this.weight = weight;
        this.height = 5;
        System.out.println("Hi from ball constructor2");
    }
    public Ball2() {
        this.weight = 5;
        this.height = 5;
        System.out.println("Hello from the ball constructor3");
    }

    public String toString() { //will be run when you print. all println use toString method-
        return "Weight is " + weight + ", height is " + height;
    }

    public static void main(String[] args) {
        Ball2 b1 = new Ball2(5.125, 5.125);
        System.out.println(b1);
        Ball2 b2 = new Ball2(5.125);
        System.out.println(b2);
        Ball2 b3 = new Ball2();
        System.out.println(b3);
        Ball2 b4 = new BaseBall2();
        System.out.println(b4);
        Ball2 b5 = new SoftBall();
        System.out.println(b5);
        BaseBall2 bb1 = new BaseBall2(5.125, 5.125);
        System.out.println(bb1);
        BaseBall2 bb2= new BaseBall2(5.125);
        System.out.println(bb2);
        BaseBall2 bb3 = new BaseBall2();
        System.out.println(bb3);
        SoftBall sft1 = new SoftBall(5.125, 5.125);
        System.out.println(sft1);
        SoftBall sft2 = new SoftBall(5.125);
        System.out.println(sft2);
        SoftBall sft3 = new SoftBall();
        System.out.println(sft3);
        bb1.hit(bb1); //instance variable is stated as BaseBall2, so we don't need to cast it
        bb3.hit((BaseBall2)b4); //created as new BaseBall2() therefore we can cast it as BaseBall2
        sft1.bludgeon(sft1);
        sft3.bludgeon((SoftBall)b5);
    }
}

class BaseBall2 extends Ball2 {
    // super() is here by default, both are Ball2() and BaseBall2() are printed
    public BaseBall2(double weight, double height) {
        super(weight, height);
        System.out.println("Hello from the baseball constructor1");
    }

    public BaseBall2(double weight) {
        super(weight);
        System.out.println("Hello from the baseball constructor2");
    }

    public BaseBall2() {
        super();
        System.out.println("Hello from the baseball constructor3");
    }

    public void hit(BaseBall2 baseball) { //"baseball" is the variable's name, can be anything
        System.out.println("I'm hitting a baseball with weight: " + weight + " and height: " + height);
    }
}

class SoftBall extends Ball2 {
    public SoftBall(double weight, double height) {
        super(weight, height);
        System.out.println("Hi, I'm a softy1");
    }
    public SoftBall(double weight) {
        super(weight);
        System.out.println("Hi, I'm a softy2");
    }

    public SoftBall() {
        super();
        System.out.println("Hi, I'm a softy3");
    }

    public void bludgeon(SoftBall softball) {
        System.out.println("I'm obliterating a ball with weight: " + weight + " and height: " + height);
    }
}