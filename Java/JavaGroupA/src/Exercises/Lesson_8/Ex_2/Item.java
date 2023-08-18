
package Exercises.Lesson_8.Ex_2;


public class Item {  
    String description;
    int quantity;
    double price;
    char colorCode = 'U';   //'U' = Undetermined

    public void displayItem() {
        System.out.println("Item: " + description + ", " + quantity + ", "
                + price + ", "+colorCode);
    }

    public void setItemFields(String desc, int qty, double pr) {
        this.description = desc;
        this.quantity = qty;
        this.price = pr;
    }

    public int setItemFields(String desc, int qty, double pr, char c) {
        if (c != ' ') {
            colorCode = c;
            this.setItemFields(desc, qty, pr);
            return 1;
        } else return -1;
    }
}
