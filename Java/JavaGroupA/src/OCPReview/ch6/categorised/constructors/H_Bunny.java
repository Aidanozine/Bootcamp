package OCPReview.ch6.categorised.constructors;

public class H_Bunny {
    String name;
    public H_Bunny() {
        System.out.print("hop");
    }
    public H_Bunny(String name) {
        this.name = name;
    }
    public void Bunny() {
        System.out.println("Not a constructor.");
    }

    public static void main(String[] args) {
        H_Bunny b1 = new H_Bunny();
        H_Bunny b2 = new H_Bunny();
        H_Bunny b3 = new H_Bunny();
        H_Bunny b4 = new H_Bunny("Harold");
        System.out.println(b4.name);
    }

}