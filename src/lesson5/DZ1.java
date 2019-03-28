package lesson5;

import lesson17.Fredj;

public class DZ1 {
    public static void main(String[] args) {

        String str = "London is a capital of the great britain";
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println("Строка в обратном порядке: " + reverse);
    }

    public static class Main {
        public static void main(String[] args) {
            Fredj fredj = new Fredj();

            try{
                fredj.addProduct(null, 2);
            }catch (NullPointerException e){
                System.out.println("пустой продукт!!!");
            }

            fredj.addProduct("яблоко", 1);
            fredj.addProduct("груша", 3);
            fredj.addProduct("слива", 1);
            fredj.addProduct("сливки", 4);

            fredj.deleteProduct("груша", 3);
            fredj.printListProduct();

        }
    }
}


