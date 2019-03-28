package lesson7;

public class Main {
    public static void main(String[] args) {
        DrobnoeChislo chislo = new DrobnoeChislo();
        chislo.setChislitel(30);
        chislo.setZnamenatel(8);
        SokrashenieDrobey calculator = new SokrashenieDrobey();
        DrobnoeChislo result = calculator.sokr(chislo);
        result.printInfo();

    }
}
