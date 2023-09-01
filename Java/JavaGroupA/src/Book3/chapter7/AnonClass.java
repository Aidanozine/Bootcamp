package Book3.chapter7;

//public class AnonClass { //version 1
//    public static void main(String[] args) {
//        Ball b = new BaseBall();
//        b.hit();
//    }
//}
//
//class BaseBall implements Ball{
//    @Override
//    public void hit(){
//        System.out.println("Hit!");
//    }
//}
//
//interface Ball {
//    void hit();
//}

//public class AnonClass { //version 2
//    public static void main(String[] args) {
//        Ball b = new Ball(){
//            @Override
//            public void hit(){
//                System.out.println("Hit!");
//            }
//        };
//        b.hit();
//    }
//}
//
//interface Ball {
//    void hit();
//}

public class AnonClass { //version 3
    public static void main(String[] args) {
        Ball b = () -> System.out.println("Hit!");
        b.hit();
    }

    interface Ball {
        void hit();
    }
}