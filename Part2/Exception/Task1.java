package Part2.Exception;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //•	Write a Java program that takes two integers as input and calculates their division. Handle the "ArithmeticException" that may occur if the second integer is zero.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       try{
           int result = a / b ;
           System.out.println(result);

       } catch (ArithmeticException e){
           System.out.println("Error: Division by zero is not allowed.");
       }
       scanner.close();
    }
}
