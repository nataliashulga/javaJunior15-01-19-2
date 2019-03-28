package lesson7;

public class DZCircleNew {

    private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

   /* public void setSqCircle(double sqCircle) {
        this.sqCircle = sqCircle;
    }

    public void setPerCircle(double perCircle) {
        this.perCircle = perCircle;
    }

    public double getRadius() {
        return radius;
    }

    public double getSqCircle() {
        return sqCircle;
    }

    public double getPerCircle() {
        return perCircle;
    }*/


    public void printInfo() {
        double square = (radius * radius) * Math.PI;
        double perimetr = 2 * Math.PI * radius;

        System.out.printf("Круг: Радиус - %f, Площадь -%f, Периметр - %f", radius, square, perimetr);
        System.out.println();
    }
}
