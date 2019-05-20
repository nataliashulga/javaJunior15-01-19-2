package lesson1818;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File dirFrom = new File("D:\\с прошлого компьютера\\programming");

        File[] filesFromDir = dirFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }

                if(pathname.getAbsolutePath().endsWith(".png") || pathname.getAbsolutePath().endsWith(".jpg") || pathname.getAbsolutePath().endsWith(".jpeg")){
                    return true;
                }
                return false;
            }
        });
        for(File file: filesFromDir){
            System.out.println(file.getAbsolutePath());
        }

    }
}
