package part5.Task7;

import java.util.concurrent.*;

public class Task7  {
    //7. Створити потік, використовуючи Callable і Future, щоб обчислити факториал числа.
    public static void main(String[] args) {
        int number = 5;

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Long> factorialTask = new FactorialTask(number);

        Future<Long> future = executorService.submit(factorialTask);

        try {
            long result = future.get();
            System.out.println("Факторіал " + number + " = " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}

class FactorialTask implements Callable<Long> {
    private int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        if (number < 0) {
            throw new IllegalArgumentException("Факторіал визначений для не-від'ємних чисел.");
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
