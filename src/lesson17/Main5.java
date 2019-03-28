package lesson17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Main5 {
    public static void main(String[] args) {

        try {
            Files.copy(new File("F://dfew.jpg").toPath(), new File("F://sfer.jd").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Попробуйте еще раз");

    }
}
