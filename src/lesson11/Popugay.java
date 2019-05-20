package lesson11;

public class Popugay extends ZooAnimal {

    public Popugay() {

    }


    public Popugay(int cost) {
        super(cost);
    }
    @Override
    public void voice() {
        System.out.println("IIIIiiaaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Попугая прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("попугай со стоимостью = " + this.getCost());
    }
}
