package part4.Task3;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Task3 {
    public static void main(String[] args) throws IOException {
        Stream<String> lines = Files.lines(Paths.get("C:\\Users\\dp070\\OneDrive\\Documents\\GitHub\\Lesson\\part4\\Task3\\doc"));
        Stream<Integer> numbers  = lines.map(Integer::parseInt);
        Integer maxNumber = numbers.max(Integer::compareTo).orElse(0);

        System.out.println("Максимальное число: " + maxNumber);
    }
}
