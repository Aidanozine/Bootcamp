package Book3.chapter5;

public class CardDealer implements Dealable {
    @Override
    public void deal(int cards) {
        System.out.println("Dealing out " + cards + " cards");
    }
    private static void startGame(Dealable deck, String game)
    {
        if (game.equals("Poker"))
            deck.deal(5);
        else if (game.equals("Hearts"))
            deck.deal(13);
        else if (game.equals("Gin"))
            deck.deal(10);
    }

    public static void main(String[] args) {
        Dealable d1 = new CardDealer();
        CardDealer d2 = new CardDealer();
        startGame(d1, "Poker");
        startGame(d2, "Hearts");
        startGame(d1, "Gin");
//        d1.startGame(d1, "Gin"); //Only works if startGame() isn't static. Also can't use if not instance of CardDealer
    }
}
