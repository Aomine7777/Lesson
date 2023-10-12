package part2.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task4 {
    public static void main(String[] args) {
        Car4 car4 = new Car4();
        String model = null;
        try{
            Field field = car4.getClass().getDeclaredField("model");
            field.setAccessible(true);
            field.set(car4,(String) "Mazda");
            model = (String) field.get(car4);
        } catch (NoSuchFieldException|IllegalAccessException e){
            e.printStackTrace();
        }
        printModel(car4);
    }
    public static void printModel(Object car4){
        try {
            Method method = car4.getClass().getDeclaredMethod("printModel");
            method.setAccessible(true);
            method.invoke(car4);
        } catch (NoSuchMethodException| InvocationTargetException|IllegalAccessException e){
            e.printStackTrace();
        }
    }
}

class Car4{

    private  String model = " BMW";
    private void printModel(){
        System.out.println(model);
    }

}


