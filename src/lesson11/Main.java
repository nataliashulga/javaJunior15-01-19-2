package lesson11;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo(100000);

        Tiger tiger = new Tiger(20000);
        Popugay popugay1 = new Popugay(40000);
        Popugay popugay2 = new Popugay(10000);
        Monkey monkey1 = new Monkey(20000);
        Monkey monkey2 = new Monkey(12000);

        zoo.buyAnimal(popugay1);
        zoo.buyAnimal(popugay2);
        zoo.buyAnimal(monkey2);
        zoo.buyAnimal(tiger);
        zoo.buyAnimal(monkey1);

        zoo.printAnimal();

        zoo.voice();
        zoo.mostExpensiveAnimal();
        zoo.summaStoimostiAll();


    }
}
