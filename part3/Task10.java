package part3;

import java.util.ArrayList;
import java.util.Stack;

public class Task10 {
    public static void main(String[] args) {
        //10.	Write a program that implements a stack using a list and demonstrates push, pop,
        // and peek operations.
        StackList stackList = new StackList();
        stackList.push(1);
        stackList.push(2);
        stackList.push(3);

        stackList.peek();

        stackList.pop();
        stackList.pop();
    }
}
class StackList{
    private ArrayList<Integer> stack;

    public StackList(){
        stack = new ArrayList<>();
    }

    public void push(int value){
        stack.add(value);
        System.out.println("Додан єлемент: " + value);
    }

    public int pop(){
        if(stack.isEmpty()){
            System.out.println("Стек пустий,");
            return -1;
        }
        int removedValue = stack.remove(stack.size() - 1);
        System.out.println("Елемент видалений: " + removedValue);
        return removedValue;
    }
    public int peek(){
        if(stack.isEmpty()){
            System.out.println("Стек пустий");
            return -1;
        }
        int topValue = stack.get(stack.size() - 1);
        System.out.println("Верхній елемент стеку: " + topValue);
        return topValue;
    }
}
