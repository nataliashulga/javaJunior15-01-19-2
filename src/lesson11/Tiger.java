package lesson11;

public class Tiger extends ZooAnimal {

    public Tiger() {

    }


    public Tiger(int cost) {
        super(cost);
    }

    public Tiger(int cost, int weight){
        super(cost, weight);
    }



    @Override
    public void voice() {
        System.out.println("RRRRRRrrrrrrrrrrrrrrr");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("тигр со стоимостью = " + this.getCost() +", вес = " + this.getWeight());
    }

}
