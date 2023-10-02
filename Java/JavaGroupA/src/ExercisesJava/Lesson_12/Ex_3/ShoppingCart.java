package ExercisesJava.Lesson_12.Ex_3;

public class ShoppingCart {
    public static void main(String[] args) {
        Item item = new Shirt(25.99, 'M', 'G');

        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor();
            System.out.println("Color: " + color);
        }else System.out.println("Item is not a Shirt.");
    }
}
