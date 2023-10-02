/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter7;

/**
 *
 * @author desmo
 */
//public class EnumTest {
//    public static void main(String[] args) {
//        enum Season{SUMMER, AUTUMN, WINTER, SPRING;}
//        var s = Season.SPRING;
//        System.out.println(s);
//        System.out.println(Season.SPRING);
//        System.out.println(s == Season.SPRING);
//        for(var season:Season.values()){
//            System.out.println(season.name() + " " + season.ordinal());
//        }
//    }
//}
//public class EnumTest {
//
//    enum Season {
//        SUMMER("High"),
//        AUTUMN("Medium"),
//        WINTER("Low"),
//        SPRING("Medium");
//
//        private final String expectedVisitors;
//
//        private Season(String expectedVisitors) {
//            this.expectedVisitors = expectedVisitors;
//        }
//
//        public void printExpectedVisitors() {
//            System.out.println(expectedVisitors);
//        }
//    }
//
//    public static void main(String[] args) {
////        var s = Season.SPRING;
////        System.out.println(s);
////        System.out.println(Season.SPRING);
////        System.out.println(s == Season.SPRING);
////        for(var season:Season.values()){
////            System.out.println(season.name() + " " + season.ordinal());
//        Season.WINTER.printExpectedVisitors();
//    }
//}
//public class EnumTest {
//
//    enum Season {
//        SUMMER("High"){
//        @Override
//        public String getHours(){
//        return "8a.m - 4p.m";
//        }},
//        AUTUMN("Medium"){
//        @Override
//        public String getHours(){
//        return "9a.m - 3p.m";
//        }},
//        WINTER("Low"){
//        @Override
//        public String getHours(){
//        return "10a.m - 2p.m";
//        }},
//        SPRING("Medium"){
//        @Override
//        public String getHours(){
//        return "9a.m - 3p.m";
//        }};
//
//        private final String expectedVisitors;
//
//        private Season(String expectedVisitors) {
//            this.expectedVisitors = expectedVisitors;
//        }
//
//        public void printExpectedVisitors() {
//            System.out.println(expectedVisitors);
//        }
//        
//        public abstract String getHours();
//    }
//
//    public static void main(String[] args) {
////        var s = Season.SPRING;
////        System.out.println(s);
////        System.out.println(Season.SPRING);
////        System.out.println(s == Season.SPRING);
////        for(var season:Season.values()){
////            System.out.println(season.name() + " " + season.ordinal());
//        Season.WINTER.printExpectedVisitors();
//        System.out.println(Season.SPRING.getHours());
//    }
//}
public class EnumTest {

    enum Season implements Weather {
        SUMMER("High visitation") {
            @Override
            public String getHours() {
                return "8a.m - 4p.m";
            }

            @Override
            public int getAvgTemp() {
                return 27;
            }
        },
        AUTUMN("Medium visitation") {
            @Override
            public String getHours() {
                return "9a.m - 3p.m";
            }

            @Override
            public int getAvgTemp() {
                return 21;
            }
        },
        WINTER("Low visitation") {
            @Override
            public String getHours() {
                return "10a.m - 2p.m";
            }

            @Override
            public int getAvgTemp() {
                return 19;
            }
        },
        SPRING("Medium visitation") {
            @Override
            public String getHours() {
                return "9a.m - 3p.m";
            }

            @Override
            public int getAvgTemp() {
                return 25;
            }
        };

        private final String expectedVisitors;

        private Season(String expectedVisitors) {
            this.expectedVisitors = expectedVisitors;
        }

        public void printExpectedVisitors() {
            System.out.println(expectedVisitors);
        }

        public abstract String getHours();
    }

    public static void main(String[] args) {
//        var s = Season.SPRING;
//        System.out.println(s);
//        System.out.println(Season.SPRING);
//        System.out.println(s == Season.SPRING);
//        for(var season:Season.values()){
//            System.out.println(season.name() + " " + season.ordinal());
        System.out.println("SPRING");
        Season.SPRING.printExpectedVisitors();
        System.out.println(Season.SPRING.getHours());
        System.out.println(Season.SPRING.getAvgTemp());

        System.out.println("SUMMER");
        Season.SUMMER.printExpectedVisitors();
        System.out.println(Season.SUMMER.getHours());
        System.out.println(Season.SUMMER.getAvgTemp());

        System.out.println("AUTUMN");
        Season.AUTUMN.printExpectedVisitors();
        System.out.println(Season.AUTUMN.getHours());
        System.out.println(Season.AUTUMN.getAvgTemp());

        System.out.println("WINTER");
        Season.WINTER.printExpectedVisitors();
        System.out.println(Season.WINTER.getHours());
        System.out.println(Season.WINTER.getAvgTemp() + " degrees");
    }
}

interface Weather {

    int getAvgTemp();
}
