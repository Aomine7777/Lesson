package String.TaskT03N14;

public class Main {
    public static void main(String[] args) {
        //TaskT03N14 Дан массив слов. Нужно вернуть массив слов, отсортированный в алфавитном порядке.
        String [] strings14 = {"Дан","массив","слов","Нужно","вернуть","массив","слов","отсортированный","в","алфавитном","порядке"};
        String [] sortedWords = sortWordsAlphabetically(strings14);
        for (String string:sortedWords) {
            System.out.println(string);
        }
    }
    public static String [] sortWordsAlphabetically (String[] strings14){
        int n = strings14.length;
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n -1; j++) {
                if(strings14[j].compareTo(strings14[j + 1]) > 0){
                    String temp = strings14[j];
                    strings14[j] = strings14[j + 1];
                    strings14[j + 1] = temp;
                }
            }
        }
        return  strings14;
    }
}
