package part4.Task19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task19  {
    public Task19() throws IOException {
    }

    public static void main(String[] args) {

    //1.Створення порожнього стріму:
    Stream<Objects> empty = Stream.empty();

    //2.Створення стріму зі списку:
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);

    //3.Створення стріму з масиву
    int[] array = {1,2,3,4,5,6,7};
        IntStream streamFromArray = Arrays.stream(array);
    }
    //4.Створення стріму з streamBuilder.
    Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build();

    //5.Створення стріму з генерацією значень:

    Stream<Integer> generetedStream = Stream.generate(() ->42);

    //6.Створення стріму з ітерацією значень:
    Stream<Integer> iteratedStream = Stream.iterate(1,n -> n + 2).limit(20);

    //7.Створення числового стріму в діапазоні:
    IntStream intStream = IntStream.range(1,10);
    LongStream longStream = LongStream.rangeClosed(1, 3);
    //Поток стрини.
    IntStream streamOfChars = "abc".chars();
    //7.Створення стріму зі значеннями вручну (Stream.of):
    Stream<String> stringStream = Stream.of("one","two","three");

    //9.Стрім з файлу
    Stream<String> lines = Files.lines(Paths.get("C:\\Users\\dp070\\OneDrive\\Documents\\GitHub\\Lesson\\part4\\Task3\\doc"));

}
