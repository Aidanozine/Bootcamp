
package Exercise8_1;

public class ShoppingCart {
    public static void main(String[] args){
        Item a = new Item();
        Item b = new Item();

        if (a.setColor('B')){
            System.out.println("a.color = " + a.color);
        } else {
            System.out.println("Invalid color");
        }

        if (b.setColor('A')){
            System.out.println("b.color = " + b.color);
        } else {
            System.out.println("Invalid color");
        }
    }
}
