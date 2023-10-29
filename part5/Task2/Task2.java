package part5.Task2;

public class Task2 {

    //2. Створити два потоки, кожен має писати повідомлення в консоль. Використати Thread, Runnable
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("First thread");
        Thread myRunnable = new MyThread("Second thread");
        myThread1.start();
        myRunnable.start();
    }

}
    class MyThread extends Thread {

        public synchronized void printMessage(){
            System.out.println(message);
        }
        private final String message;

        public MyThread(String message) {
            this.message = message;
        }

        @Override
        public void run() {
            printMessage();
        }
    }
