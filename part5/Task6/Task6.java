package part5.Task6;


import java.util.LinkedList;
import java.util.List;

public class Task6 {
    //6. Реалізувати сценарій, коли два потоки по черзі друкують парні та непарні числа від 1 до 10 за допомогою wait() і notify().
    private static final Object lock = new Object();
    private static int number = 1;
    private static final int maxNumber = 10;

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= maxNumber) {
                synchronized (lock) {
                    if (number % 2 == 1) {
                        System.out.println("Непарне: " + number);
                        number++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (number <= maxNumber) {
                synchronized (lock) {
                    if (number % 2 == 0) {
                        System.out.println("Парне: " + number);
                        number++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        }
    }
}

