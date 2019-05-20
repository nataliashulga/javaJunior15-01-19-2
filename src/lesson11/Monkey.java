package lesson11;

public class Monkey  extends ZooAnimal {
    public Monkey() {

    }


    public Monkey(int cost) {
        super(cost);
    }

    @Override
    public void voice() {
        System.out.println("YAYYAYYyyyyaaaaaaaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("обезьяна со стоимостью = " + this.getCost());

    }
}
