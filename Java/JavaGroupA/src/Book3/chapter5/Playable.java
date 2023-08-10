package Book3.chapter5;

public interface Playable {
    void play();
    default void quit() {
        System.out.println("No quitting allowed");
    }
}
