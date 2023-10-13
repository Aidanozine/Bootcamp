package OCPReview.ch6.categorised.constructors;

public class L_Gopher {
}

class Gopher {
    public Gopher(int dugHoles) {
//        this(5); // DOES NOT COMPILE
    }
}

class Gopher2 {
    public Gopher2() {
//        this(5); // DOES NOT COMPILE
    }
    public Gopher2(int dugHoles) {
        this();
    }
}
