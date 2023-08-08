package Book3.chapter5;

public abstract class Ball {
    public abstract void hit(int batSpeed);

    public static void main(String[] args) {
//        BaseBall bb = new BaseBall();
//        System.out.println(bb.hit(200));
        BallFactory bf = new BallFactory();
        Ball ball1 = bf.getBall("BaseBall");
        Ball ball2 = bf.getBall("SoftBall");
        ball1.hit(50);
        ball2.hit(100);
    }
}

class BaseBall extends Ball {
    public void hit(int batSpeed) {
        System.out.println("Baseball is going at a speed of " + batSpeed);
        }
}

class SoftBall extends Ball {
    public void hit(int batSpeed) {
        System.out.println("Softball is going at a speed of " + batSpeed);
    }
}
