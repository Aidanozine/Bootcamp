package OCP.Ch14;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatingPaths {
    public static void main(String[] args) {
        Path spawnPathA = Path.of("C:/Users/desmo/Desktop/Bootcamp/Java/JavaGroupA");
        System.out.println(Files.exists(spawnPathA));
        Path spawnPathB = Path.of("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java");
        System.out.println(Files.exists(spawnPathB));
//-----------------------------------CLASS METHOD-----------------------------
        Path spawnPathC = Paths.get("C:/Users/desmo/Desktop/Bootcamp/Java/JavaGroupA");
        System.out.println(Files.exists(spawnPathC));
        Path spawnPathD = Paths.get("C:\\Users\\desmo\\Desktop\\Bootcamp\\Java");
        System.out.println(Files.exists(spawnPathD));
    }
}
