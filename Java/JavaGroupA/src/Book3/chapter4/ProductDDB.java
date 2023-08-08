package Book3.chapter4;

import java.io.IOException;
public class ProductDDB {
    public static Product getProduct(String code) {
        Product p;
        try{
            p = new Product("z");
                return p;
            } catch (ProductDataException e) {
                return new Product();
            }
    }

    public static void main(String[] args) throws ProductDataException{
        Product p = ProductDDB.getProduct("z");
        System.out.println(p);
    }

}

class Product {
        String code;

    public Product (String code) throws ProductDataException {
        if (code.equalsIgnoreCase("z")) {
            throw new ProductDataException("Product error");
        }
        this.code = code;
    }

    public Product() {
        this.code = "a";
    }

    public String toString() {
        return "The code is " + this.code;
    }
}
