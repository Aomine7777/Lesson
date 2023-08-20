package Part2.Exception;

import java.io.File;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    try{
        Scanner scanner = new Scanner(System.in);
        int next = scanner.nextInt();
       if (next > 0){
           System.out.println(next);
       }
       if (next < 0){
           throw new NegativeNumberException("NegativeNumberException");
       }
    }catch (NegativeNumberException e){
        System.out.println("Error");
    }
    }

}
 class NegativeNumberException extends RuntimeException{
    public NegativeNumberException (String errorMessage){
        super(errorMessage);
    }
}
