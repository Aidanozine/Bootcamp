package Book3.chapter5;

public class TestBalls implements PlayableBall{
    @Override
    public void ThrowBall() {
        System.out.println("Throw");
    }

    @Override
    public void CatchBall() {
        System.out.println("Catch");
    }

    @Override
    public void KickBall() {
        System.out.println("Kick");
    }

    @Override
    public void dropBall() {
        System.out.println("Woops");
    }

    public static void main(String[] args) {
        TestBalls t = new TestBalls();
        t.ThrowBall();
        t.CatchBall();
        t.KickBall();
        t.dropBall();
    }
}
