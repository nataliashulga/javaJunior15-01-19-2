package lessom16;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Tovar> tovars = new HashSet<>();

        Tovar tovar1 = new Tovar(12, 1000, "Мышка qwerty", 5, 0, 10);
        Tovar tovar2 = new Tovar(1, 100, "Мышка 123456", 5, 7, 6);
        Tovar tovar3 = new Tovar(188, 100, "Мышка qwerty", 4, 5, 10);
        Tovar tovar4 = new Tovar(165, 1080, "Мышка dss", 4, 70, 56);
        Tovar tovar5 = new Tovar(5, 1080, "Клавиатура", 2, 73, 3);
        Tovar tovar6 = new Tovar(15, 105550, "Переходник", 5, 7, 1);

        tovars.add(tovar1);
        tovars.add(tovar2);
        tovars.add(tovar3);
        tovars.add(tovar4);
        tovars.add(tovar5);
        tovars.add(tovar6);

        SortingTovars.sortByPriceReverse(tovars);
        System.out.println("-------------");
        SortingTovars.sortByCount(tovars);

    }


}
