package Book3.chapter2;

//public class PlayerApp {
//    public static void main(String[] args) {
//        Player p1 = new Player();
//        p1.health = 10;
//        System.out.println("Player 1 health status: " + p1.health);
//
//        Player p2 = new Player();
//        p2.health = 4;
//        System.out.println("Player 2 health status: " + p2.health);
//    }
//}

//The following allows access if Player.java has private setting
public class PlayerApp {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.setHealth(11);
        System.out.println("Player 1 health status: " + p1.getHealth());

        Player p2 = new Player();
        p2.setHealth(3);
        System.out.println("Player 2 health status: " + p2.getHealth());
    }
}