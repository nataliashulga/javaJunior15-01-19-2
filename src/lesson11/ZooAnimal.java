package lesson11;

public abstract class ZooAnimal {
    private int cost;
    private int weight;

    public ZooAnimal() {

    }

    public ZooAnimal(int cost) {
        this.cost = cost;
    }

    public ZooAnimal(int cost, int weight){
        this.cost = cost;
        this.weight = weight;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public abstract void voice();

    public abstract void jump();
    public abstract void printInfo();


}
