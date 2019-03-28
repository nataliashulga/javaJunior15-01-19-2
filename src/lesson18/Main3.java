package lesson18;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Natalia\\Documents");

        File[] dirs = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.getAbsolutePath().endsWith(".jpg") ||
                        pathname.getAbsolutePath().endsWith(".png") ||
                        pathname.getAbsolutePath().endsWith(".jpeg") || pathname.isDirectory()) {
                    return true;
                }
                return false;
            }
        });
        for (File f : dirs) {
            System.out.println(f.getAbsolutePath());
        }


    }
}
