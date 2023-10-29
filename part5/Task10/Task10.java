package part5.Task10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task10 {
    //10. Прочитати CSV файл. Порахувати загальну кількість рядків.
    public static void main(String[] args) {
        String csvFilePath = "part5/Task10/Hello.scv";
        int rowCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                rowCount++;
            }

            System.out.println("Total number of rows: " + rowCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

