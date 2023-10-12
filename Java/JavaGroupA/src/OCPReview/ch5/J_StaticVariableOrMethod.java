package OCPReview.ch5;

import OCPReview.ch5.H2_.Snake;

public class J_StaticVariableOrMethod {
}

class SlimySnake {
    public static long hiss = 2;
}

class SnakeTest {
    public static void main(String[] args) {
        System.out.println(SlimySnake.hiss);
        SlimySnake s = new SlimySnake();
        System.out.println(s.hiss); // s is a Snake
        s = null;
        System.out.println(s.hiss); // s is still a Snake

        SlimySnake.hiss = 4;
        SlimySnake snake1 = new SlimySnake();
        SlimySnake snake2 = new SlimySnake();
        SlimySnake.hiss = 6;
        SlimySnake.hiss = 5;
        System.out.println(Snake.hiss);
    }
}