package lessom16;

import java.util.HashSet;
import java.util.TreeSet;

public class SortingTovars {



    public static void sortByPrice(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>();
        result.addAll(tovars);
        for(Tovar t:result){
            System.out.println(t);
        }
    }

    public static void sortByPriceReverse(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>(new PriceReverse());
        result.addAll(tovars);
        for(Tovar t:result){
            System.out.println(t);
        }
    }

    public static void sortByCount(HashSet<Tovar> tovars){
        TreeSet<Tovar> result = new TreeSet<>(new CoutnSotr());
        result.addAll(tovars);
        for(Tovar t:result){
            System.out.println(t);
        }
    }


}
