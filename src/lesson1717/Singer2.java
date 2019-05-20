package lesson1717;

public class Singer2 extends Thread{

    @Override
    public void run() {
        while (true){
            synchronized (Monitors.mikrofon){
                try {
                    Monitors.mikrofon.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                for(int i = 0; i < 4; i++){
                    System.out.println("FA-------------------");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                synchronized (Monitors.mikrofon){
                    Monitors.mikrofon.notify();
                }

            }
        }
    }
}
