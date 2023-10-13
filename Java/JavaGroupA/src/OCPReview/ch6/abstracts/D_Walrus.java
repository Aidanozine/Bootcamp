package OCPReview.ch6.abstracts;

abstract class Animal {
    public abstract String getName();
}

public class D_Walrus extends Animal {

    @Override
    public String getName() {
        return "Walrus";
    }

    public static void main(String[] args) {
        D_Walrus wal = new D_Walrus();
        System.out.println(wal.getName());
    }
}
