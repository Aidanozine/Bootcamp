package Book8.chapter1;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
//        File file = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8");
//        if (file.exists()){
//            System.out.println("File found!");
//        } else {
//            System.out.println("File not found!");
//        }

//        File file = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\hits.log");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created");
//            } else {
//                System.out.println("File could not be created");
//            }
//        } catch (Exception e){
//            System.out.println("Error creating file");
//        }

//        File dir = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src");
//        if (dir.isDirectory()){
//            File[] files = dir.listFiles();
//            for (File f : files){
//                System.out.println(f.getName());
//            }
//        } else {
//            System.out.println("File does not exist");
//        }

//        File file = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\hits.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created");
//            } else {
//                System.out.println("File could not be created");
//            }
//        } catch (Exception e){
//            System.out.println("Error creating file");
//        }
//        if (file.renameTo(new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\hitsRename.txt"))){
//            System.out.println("File Successfully Renamed");
//        } else {
//            System.out.println("File not found");
//        }
        File file = new File("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\hitsRename.txt");
        if (file.delete()){
            System.out.println("File Successfully Deleted");
        } else {
            System.out.println("Failed to delete file");
        }
    }
}
