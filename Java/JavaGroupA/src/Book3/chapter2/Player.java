package Book3.chapter2;

//public class Player {
//    public int health;
//     public int getHealth() {
//         return health;
//     }
//
//     public void setHealth(int h) {
//         this.health = h;
//     }
//}

public class Player {
    private int health; //Restricts access
    public int getHealth() {
        return health;
    }

    public void setHealth(int h) {
//        if ((health > 0) && (health < 10)) {
//            this.health = h;
//        } else {
//                System.out.println("Invalid health entry!");
//            }

        if (h < 0) {
            System.out.println("Too low!");;
        } else {
            if (h > 10) {
                System.out.println("Too high!");;
            } else {
                health = h;
            }
        }

//        if (h < 0) {
//            health = 0;
//        } else {
//            if (h > 100) {
//                health = 100;
//            } else {
//                health = h;
//            }
//        }

    }
}