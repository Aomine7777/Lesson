package part5.Task11;

import java.io.*;

public class Task11 {
    //11. Скопіювати вміст одного текстового файлу в інший.
    public class CopyTextFile {
    }
    public static void main(String[] args) {
        String firstFilePath = "part5/Task11/firstFile";
        String secondFilePath = "part5/Task11/secondFile";

        try (BufferedReader reader = new BufferedReader(new FileReader(firstFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(secondFilePath))) {

            String line;
            while ((line = reader.readLine()) != null) {

                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}