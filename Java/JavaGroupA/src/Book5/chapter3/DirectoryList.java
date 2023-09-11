package Book5.chapter3;

import java.io.File;
import java.util.Scanner;

public class DirectoryList {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Directory List");

        do {
            System.out.println("Enter a path: ");
            String path = sc.nextLine();

            File dir = new File(path);
            if(!dir.exists() || !dir.isDirectory()){
                System.out.println("Directory can't be found!");
            } else {
                System.out.println("Listing directory tree: ");
                System.out.println(dir.getPath());
                listDirectories(dir, " ");
            }
        } while(askAgain());
    }

    private static void listDirectories(File dir, String indent){
        File[] dirs = dir.listFiles();
        for (File f : dirs){
            if (f.isDirectory()){
                System.out.println("Directory: " + indent + f.getName());
                listDirectories(f,indent + " ");
            }
        }
    }

    private static boolean askAgain(){
        System.out.println("Another? (Y or N)");
        String reply = sc.nextLine();
        if (reply.equalsIgnoreCase("Y")){
            return true;
        } else {
            return false;
        }
    }
}
