package lessom16;

import java.util.Comparator;

public class CoutnSotr implements Comparator<Tovar> {

    @Override
    public int compare(Tovar o1, Tovar o2) {

        if(o1.getBuyCount() != o2.getBuyCount()){
            return o1.getBuyCount() - o2.getBuyCount();
        }

        if(o1.getPrice() != o2.getPrice()){
            return o1.getPrice() - o2.getPrice();
        }


        if(o1.getReiting() != o2.getReiting()){
            return o1.getReiting() - o2.getReiting();
        }

        if(o1.getView() != o2.getView()){
            return o2.getView() - o1.getView();
        }

        if(o1.getView() != o2.getView()){
            return o2.getView() - o1.getView();
        }

        return o2.getName().compareTo(o1.getName());
    }
}
