package OCPReview.ch6.abstracts;

public abstract class C_Canine {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }
}

class Wolf extends C_Canine {

    @Override
    public String getSound() {
        return null;
    }
}

class Fox extends C_Canine {

    @Override
    public String getSound() {
        return null;
    }
}

class Coyote extends C_Canine {

    @Override
    public String getSound() {
        return null;
    }
}

class CanineTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        Coyote c = new Coyote();

//        C_Canine c2 = new C_Canine(); // Does Not Compile
    }
}

//class abstract Bear { // DOES NOT COMPILE
//    public int abstract howl(); // DOES NOT COMPILE
//}

abstract class Bear {
    abstract public int howl();
//    public abstract int howl(); //either one compiles
}