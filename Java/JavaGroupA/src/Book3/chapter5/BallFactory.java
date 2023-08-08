package Book3.chapter5;

public class BallFactory {
    public Ball getBall(String b) {
        if (b.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        }
        if (b.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }
        return null;
    }
}
