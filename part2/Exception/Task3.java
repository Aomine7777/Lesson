package part2.Exception;

public class Task3 {
    public static void main(String[] args) {
        String text = null;
        try{
            int lenght = text.length();
            System.out.println(lenght);
        } catch (NullPointerException e){
            System.out.println("Exception");
        }
    }
}
