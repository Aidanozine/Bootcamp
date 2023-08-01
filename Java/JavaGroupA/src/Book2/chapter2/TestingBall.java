package Book2.chapter2;

public class TestingBall {
    public static void main(String[] args) {
        class Ball{
            int speed;

            void setSpeed(int speed) {
                this.speed = speed;
            }
        }
        Ball b1 = new Ball();
        Ball b2 = b1;

        b1.setSpeed(50);
        b2.setSpeed(100);
        System.out.println(b1.speed);
    }
}