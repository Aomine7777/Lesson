package part2.Reflection;

import java.lang.annotation.*;
import java.lang.reflect.*;
public class Task5 {
    public static void main(String[] args) {
        Class<MyClass> clazz = MyClass.class;
        MyAnnotation classAnnotation = clazz.getAnnotation(MyAnnotation.class);
        if(classAnnotation != null){
            System.out.println(classAnnotation.value());
        }
        Method[] methods = clazz.getDeclaredMethods();
        for(Method method : methods){
            MyAnnotation methodAnnotation = method.getAnnotation(MyAnnotation.class);
            if(methodAnnotation != null){
                System.out.println(method.getName() + " " + methodAnnotation.value());
            }
        }
    }

}
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation{
    String value();
}
class MyClass{
    @MyAnnotation ("Method 1")
    public void method1(){
        System.out.println("Method 1");
    }
    @MyAnnotation ("Method 2")
    public void method2(){
        System.out.println("Method 2");
    }
}
