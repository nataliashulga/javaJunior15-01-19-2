package lesson1717;

public class Singer1 extends Thread {
    private boolean isRun = true;

    @Override
    public void run() {
        int count = 0;
        while (isRun){
            for(int i = 0; i < 3; i++){
                System.out.println("--------------LA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());

            synchronized (Monitors.mikrofon){
                Monitors.mikrofon.notify();
            }

            synchronized (Monitors.mikrofon){
                try {
                    Monitors.mikrofon.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            count++;
            if(count > 3){
                isRun = false;
            }


        }
    }
}
