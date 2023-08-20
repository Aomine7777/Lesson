package Part2.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int addition = a + b;
            int division = a / b;
        } catch (InputMismatchException e){
            System.out.println("InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
        scanner.close();
    }
}
