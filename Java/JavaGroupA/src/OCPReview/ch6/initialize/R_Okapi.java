package OCPReview.ch6.initialize;

class GiraffeFamily {
    static {
        System.out.print("A"); //only prints once
    }

    {
        System.out.print("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");
    }
}

class Okapi extends GiraffeFamily {
    static {
        System.out.print("F"); //only prints once
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H");
    }

    public static void main(String[] grass) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}