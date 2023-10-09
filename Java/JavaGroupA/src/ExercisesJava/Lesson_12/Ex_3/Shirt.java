package ExercisesJava.Lesson_12.Ex_3;

public class Shirt extends Item{
    private char size;
    private char colorCode;
    
    public Shirt(double price, char size, char colorCode){
        super ("Shirt", price);
        this.size = size;
        this.colorCode = colorCode;
    }
    
    public void display(){
        super.display();
        System.out.println("\tSize: "+size);
        System.out.println("\tColor Code: "+ colorCode);
    }

    public String getColor(){
        String color = "";
        switch (colorCode){
            case 'R':
                color = "Red";
                break;
            case 'G':
                color = "Green";
                break;
            case 'B':
                color = "Blue";
                break;
            case 'Y':
                color = "Yellow";
                break;
            default:
                color = "Invalid code";
        }
        return color;
   }
}