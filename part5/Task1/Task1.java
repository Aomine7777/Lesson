package part5.Task1;

public class Task1 {

    //1. Створити два потоки, кожен має писати повідомлення в консоль. Використати Thread, Runnable
    public static void main(String[] args) {
    MyThread myThread1 = new MyThread("First thread");
    Thread myRunnable = new Thread(new MyRunnable("Second thread"));
        myThread1.start();
        myRunnable.start();
    }
}
class MyThread extends Thread {

    private final String message;

    public MyThread(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(message);
    }
}
    class MyRunnable implements Runnable{

        private  String message;

        public MyRunnable(String message){
            this.message = message;
        }
        @Override
        public void run(){
            System.out.println(message);
        }
    }