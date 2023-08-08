package Book3.chapter5;

public class TicTacToe extends Game implements Playable, CardGame {
    @Override
    public void play() {
        System.out.println("Playing tic tac toe");
    }

    @Override
    public void cardShuffle() {
        System.out.println("Everyday I'm shuffling");
    }

    public static void main(String[] args) {
//        Game g = new TicTacToe(); //parent can't access qualities of the child
//        g.play();
        TicTacToe g1 = new TicTacToe();
        g1.play();

        TicTacToe g2 = new TicTacToe();
        g2.cardShuffle();

        Playable g3 = new TicTacToe(); //can use implement as well
        g3.play();

        CardGame g4 = new TicTacToe(); //can use implement as well
        g4.cardShuffle();
    }
}
