package part5.Task8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task8 {
    //8. Прочитати та надрукувати вміст текстового файлу, використовуючи BufferedReader.
        public static void main(String[] args) {
            String filePath = "part5/Task8/Text";

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

