package lesson1717;

public class Vedushii {
    public static void main(String[] args) {
        System.out.println("Начинаем концерт!");

        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();

        System.out.println(Thread.currentThread().getName());


        while (singer1.isAlive()){

        }

        System.out.println("Концерт окончен!");
    }
}
