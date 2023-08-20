package Part2.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Car myCar = null;

        try {
            Class clazz = Class.forName(Car.class.getName());
            Class[] params = {int.class, String.class};
            myCar = (Car) clazz.getConstructor(params).newInstance(4,"BMW");
        }catch (ClassNotFoundException|InstantiationException|IllegalAccessException|NoSuchMethodException|InvocationTargetException e){
            e.printStackTrace();
        }
        System.out.println(myCar);
    }



}

class Car implements  Drive {
    private int wheels;
    private  String model;
public Car (int wheels,String model){
    this.wheels = wheels;
    this.model = model;
}
}
interface Drive{

}

