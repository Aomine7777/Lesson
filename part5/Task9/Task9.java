package part5.Task9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task9{
    //9. Записати дані в текстовий файл, використовуючи BufferedWriter.
    public static void main(String[] args) {
        String filePath = "part5/Task9/Text";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Записати дані в текстовий файл, використовуючи BufferedWriter.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}