package OCPReview.ch6.categorised.constructors;

public class I_Hamster {
    private String color;
    private int weight;
    public I_Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }
    public I_Hamster(int weight) { // Second constructor
        this(weight, "brown");
        // this or super must always be the first statement, always.
    }

    public static void main(String[] args) {
        var h1 = new OCPReview.ch6.categorised.constructors.I_Hamster(12);
        System.out.println(h1);
        var h2 = new OCPReview.ch6.categorised.constructors.I_Hamster(12, "white");
        System.out.println(h2);
    }

    @Override
    public String toString() {
        return "Weight:%d Color:%s".formatted(this.weight, this.color);
    }
}
