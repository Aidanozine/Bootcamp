package Book3.chapter2;

public class ActorApp {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Tom", "Cruise");
        Actor actor2 = new Actor("Brad", "Pitt", true);
        System.out.println(actor1.firstName + " " + actor1.lastName + " is good at acting: " + actor1.isGood);
        System.out.println(actor2.firstName + " " + actor2.lastName + " is good at acting: " + actor2.isGood);
        actor1.printObject(); //address of "actor1" instance object
        actor2.printObject(); //address of "actor2" instance object
    }
}
