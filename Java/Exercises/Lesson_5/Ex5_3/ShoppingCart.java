
package Exercise5_3;

public class ShoppingCart {

    public static void main(String[] args) {
        String cons = "Bill Murray";
        String message;
                
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
       
        String itemList[];
        itemList = new String[4];
        itemList[0] = "Hat";
        itemList[1] = "Belt";
        itemList[2] = "Scarf";
        itemList[3] = "Pants";
        
        message = cons + " wants to purchase "+itemList.length+" items.";
        System.out.println(message);

        System.out.println("Items purchased: ");
        
        for (String item : itemList ){
           System.out.print(item + ", ");
        }
    }    
}
