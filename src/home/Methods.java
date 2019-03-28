package home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Methods {
    public static double getNumber() {
        Scanner scn = new Scanner(System.in);
        int j = 0;
        for (int i = 0; i >= 0; i++) {
            try {
                j = Integer.parseInt(scn.next());
                break;
            } catch (Exception e) {
                System.out.println("Ошибка, введите число");
                continue;
            }
        }
        return j;
    }

    public static char getOperation() {
        Scanner scn = new Scanner(System.in);
        String s = "";
        for (int i = 0; i >= 0; i++) {
            s = scn.next();
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                break;
            } else {
                System.out.println("Ошибка. Введите знак операции");
                continue;
            }
        }
        char c = s.charAt(0);
        return c;
    }

    public static double calc(double num1, double num2, char operation) {
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
        }
        if (operation == '-') {
            result = num1 - num2;
        }
        if (operation == '*') {
            result = num1 * num2;
        }
        if (operation == '/') {
            for (int i = 0; i >= 0; i++) {
                if (num2 == 0) {
                    System.out.println("На ноль делить нельзя. Введите другое число");
                    num2 = getNumber();
                    continue;
                } else {
                    result = num1 / num2;
                }
            }
        }
        return result;

    }
}
