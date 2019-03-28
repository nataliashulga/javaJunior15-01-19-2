package lesson17;

import java.util.HashMap;
import java.util.Set;

public class Fredj {
    private HashMap<String, Integer> produkts = new HashMap<>();
    private int capasity = 50;

    public void addProduct(String product, int value) throws NullPointerException {
        if(product == null){
            throw new NullPointerException("product is null");
        }
        if (produkts.containsKey(product)) {
            int currentValue = produkts.get(product);
            int newValue = value + currentValue;
            produkts.put(product, newValue);
        } else {
            produkts.put(product, value);
        }
    }

    public void deleteProduct(String product, int value){

        if(!produkts.containsKey(product)){
            System.out.println("Такого продукта в холодильнике нет!!!");
            return;
        }

        int carrentValue = produkts.get(product);
        if(value > carrentValue){
            System.out.println("Вы запрашиваете больше чем есть!!!");
            return;
        }

        int newValue = carrentValue - value;
        if(newValue == 0){
            produkts.remove(product);
        }else{
            produkts.put(product, newValue);
        }

    }

    public void printListProduct() {
        Set<String> prodNames = produkts.keySet();
        for (String name : prodNames) {
            System.out.printf("%s - %d кг", name, produkts.get(name));
            System.out.println();
        }
    }

}
