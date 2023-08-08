package String.TaskT03N05;

public class Main {

        public static void main(String[] args) {

            String word15 = new String("амо") ;
            int indexOfa = word15.indexOf("а");
            int lastIndexOfb = word15.lastIndexOf("о");
            if(indexOfa != -1 && lastIndexOfb != -1){
                char [] arr15 =  word15.toCharArray();
                arr15[indexOfa] = 'o';
                arr15[lastIndexOfb] = 'a';
                System.out.println(new String(arr15));
            }else
                System.out.println(word15);

        }

}
