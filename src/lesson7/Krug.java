package lesson7;

public class Krug {
    private double radius;

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public double dlinaKruga() {
        return 2*Math.PI*radius;
    }

    public double ploshad() {
        return (Math.pow(radius,2))*Math.PI;
    }

    public void printInfo() {
        System.out.printf("Радиус-%s, Длина окружности-%s, Площадь круга-%s", radius, dlinaKruga(), ploshad());
    }
}
