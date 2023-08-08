package Book3.chapter4;

public class Game {
    public void play() {
        System.out.println("Checkmate!"); //GameApp will only print this if it doesn't have it's own trait
    }
}

class Chess extends Game {
    public void play() { //GameApp will display "Checkmate!" when this is commented out
        System.out.println("I GIVE UP!" + "\nMercy!");
//        super.play(); //refer to BaseBallApp
    }
}
