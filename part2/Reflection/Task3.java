package part2.Reflection;

import java.lang.reflect.Field;

public class Task3 {
    public static void main(String[] args) {
        Car3 car3 = new Car3();
        String model = null;
        try{
            Field field = car3.getClass().getDeclaredField("model");
            field.setAccessible(true);
             field.set(car3,(String) "Mazda");
            model = (String) field.get(car3);
        } catch (NoSuchFieldException|IllegalAccessException e){
            e.printStackTrace();
        }
        System.out.println(model);
    }
}

    class Car3{

        private  String model = " BMW";

    }
