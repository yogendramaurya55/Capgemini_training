package Assignment;

public class Timer implements Runnable {

    static int count;

    @Override
    public void run() {

        int r = 0;

        while (r < 3) {

            for (int i = 0; i < 10; i++) {

                System.out.println(Thread.currentThread().getName() + " " + count++);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            count = 0;
            r++;
        }
    }

    public static void main(String[] args) {

        Timer obj = new Timer();

        Thread t1 = new Thread(obj, "Timer");

        t1.start();
    }
}