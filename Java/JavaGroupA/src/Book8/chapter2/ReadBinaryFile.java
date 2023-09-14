package Book8.chapter2;

import java.io.*;
import java.text.NumberFormat;

public class ReadBinaryFile {
    public static void main(String[] args) {
        NumberFormat cf = NumberFormat.getCurrencyInstance();
        DataInputStream in = getStream("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java\\JavaGroupA\\src\\Book8\\chapter2\\movies.dat");
        boolean eof = false;
        while (!eof){
            Movie movie = readMovie(in);
            if (movie == null){
                eof = true;
            } else {
                String msg = Integer.toString(movie.year);
                msg += ": " + movie.title;
                msg += "( " + cf.format(movie.price) + " )";
                System.out.println(msg);
            }
        }
        closeFile(in);
    }

    private static class Movie {
        public String title;
        public int year;
        public Double price;
        public Movie(String title, int year, Double price){
            this.title = title;
            this.year = year;
            this.price =price;
        }
    }

    private static DataInputStream getStream(String name){
        DataInputStream in = null;
        try {
            File file = new File(name);
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch(FileNotFoundException e){
            System.out.println("Encountered error: " + e);
            System.exit(0);
        }
        return in;
    }

    private static Movie readMovie(DataInputStream in){
        String title = "";
        int year = 0;
        Double price = 0.0;
        try {
            title = in.readUTF();
            year = in.readInt();
            price = in.readDouble();
        } catch(EOFException e){
            System.out.println("----End of File----");
            return null;
        } catch(IOException e){
            System.out.println("Encoiuntered error: " + e);
            System.exit(0);
        }
        return new Movie(title, year, price);
    }

    private static void closeFile(DataInputStream in){
        try {
            in.close();
        } catch(IOException e){
            System.out.println("Encountered error: " + e);
            System.out.println();
        }
    }
}
