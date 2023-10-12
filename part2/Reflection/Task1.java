package part2.Reflection;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

     Animal animal = new Animal();

     try {
         //Print class name
         Class clazz = Class.forName(Animal.class.getName());
         animal = (Animal) clazz.newInstance();

         //Print interface
         Class[] interfaces = clazz.getInterfaces();
         System.out.println(Arrays.toString(interfaces));


         // Print superclass
         Class superClass = clazz.getSuperclass();
         if(superClass != null){
             System.out.println(superClass.getName());
         } else{
             System.out.println("No Superclass");
         }
     }  catch (ClassNotFoundException|InstantiationException |IllegalAccessException e){
         e.printStackTrace();
     }
        System.out.println(animal);
    }



}

 class Animal implements  Run {

 }
 interface Run{

 }
