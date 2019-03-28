package home;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {


        System.out.println("Введите первое число");
        double firstNumber = Methods.getNumber();

        System.out.println("Введите оперцию");
        System.out.println();
        char operation = Methods.getOperation();

        System.out.println("Введите второе число");
        double secondNumber = Methods.getNumber();

        double result = Methods.calc(firstNumber, secondNumber, operation);
        if (result - (int) result == 0) {
            System.out.println("Ответ " + (int) result);
        } else {
            System.out.println("Ответ " + result);
        }


    }
}

