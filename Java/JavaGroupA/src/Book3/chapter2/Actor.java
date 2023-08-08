package Book3.chapter2;

public class Actor {
    String firstName;
    String lastName;
    boolean isGood;

    public Actor(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public Actor(String first, String last, boolean isGood) {
        this.firstName = first;
        this.lastName = last;
        this.isGood = isGood;
    }

    public void printObject() {
        System.out.println(this);
    }

    //overrides the println(this)
    @Override //not necessary but helpful for other developers
    public String toString() {
       return this.firstName + " " + this.lastName;
    }
}
