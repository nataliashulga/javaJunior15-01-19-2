package lesson7;

public class Phone {
    private double diagonal;
    private String color;
    private int battery;
    private String name;

    public void setBattery(int newBattery){
        this.battery = newBattery;
    }



    public void printInfo(){
        System.out.printf("Телефон: диагональ - %f, батарея - %d, цвет - %s, имя - %s", diagonal, battery, color, name);
        System.out.println();
    }



}
