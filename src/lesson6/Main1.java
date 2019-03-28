package lesson6;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Start");
        for (int dni = 0; dni < 366; dni++) {
            for (int hour = 0; hour < 25; hour++) {
                for (int minets = 0; minets < 61; minets++) {
                    for (int seconds = 0; seconds < 61; seconds++) {
                        System.out.printf("От старта прошло: %d дня, %d часа, %d минут, %d секунд", dni, hour, minets, seconds);
                        System.out.println();

                        Thread.sleep(100);

                    }
                }
            }
        }
        System.out.println("End");
    }
}
