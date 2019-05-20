package lesson10;

public class Animal {
    private int age;
    private String name;

    public Animal(){

    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }


    public void setAge(int age){
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printToConsol(){
        System.out.println("Животное с созрастом " + this.getAge());
    }
}
