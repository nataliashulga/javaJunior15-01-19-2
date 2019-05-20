package lesson1919;

public class Main {
    public static void main(String[] args) {
        FileCopyWithChannel copyUtils1 = new FileCopyWithChannel();
        FileCopyWithJava7 copyUtils2 = new FileCopyWithJava7();

        try {
            copyUtils2.copyFile("D:\\с прошлого компьютера\\programming\\lectures and tasks\\лекции java core\\интерфейсы\\study-interfaces-1.0.jar",
                    "D:\\с прошлого компьютера\\programming\\lectures and tasks\\лекции java core\\интерфейсы\\study-interfaces-3.0.jar");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }


    }
}
