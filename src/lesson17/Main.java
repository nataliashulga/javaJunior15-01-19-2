package lesson17;


import lesson5.StringUtils;
import lesson5.Student;

public class Main {
    public static void main(String[] args) {
        String text = "qwerty";

        byte a = 120;

        text.length();

        Student.printHello();
        int result = Student.squareArea(12);
        System.out.println(result);

        int result2 = Student.squareArea(16);
        System.out.println(result2);

        String reverce = StringUtils.reverce("Text");
        System.out.println(reverce);

        String reverce1 = StringUtils.reverce("dfjrkirtrit");
        System.out.println(reverce1);

        StringUtils.printZlassFromText("text to print");
        StringUtils.printZlassFromText("main text");

    }


}
