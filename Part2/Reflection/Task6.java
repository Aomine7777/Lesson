package Part2.Reflection;
import java.lang.reflect.Field;
public class Task6 {
    public static void main(String[] args) {
        Class<MyEnum> enumClass = MyEnum.class;

        MyEnum[] enumConstants = enumClass.getEnumConstants();
        for(MyEnum enumConstant : enumConstants){
            System.out.println(enumConstant + " " + enumConstant.getDescription());
        }
    }

}
enum MyEnum {
    FIRST("First Value"),SECOND("Second Value"),THIRD("Third Value");

    private String description;

    MyEnum(String description){
        this.description = description;
    }
    public String getDescription(){
        return description;
    }
}




