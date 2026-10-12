public class Main {
    private static int counter = 0;
    private static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        int loops = 100;


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < loops; i++)
                synchronized (lock) {
                    counter += 1;
                }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < loops; i++) {
                synchronized (lock) {
                    counter += 2;
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter);

    }
}


