package part5.Task14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Task14 {
    //14. Використати flatMap для зведення списку об’єктів, що містять вкладені списки - клас студент, у нього вкладений список предметів, які він відвідує (List<String>). Вивести всі предмети, які відвідують всі студенти (List<Student>)
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", List.of("Math", "Physics", "Chemistry")));
        students.add(new Student("Bob", List.of("Math", "English", "History")));
        students.add(new Student("Carol", List.of("Math", "Chemistry", "Biology")));
        students.add(new Student("David", List.of("Math", "Physics", "English")));

        List<String> commonSubjects = students.stream()
                .map(Student::getSubjects)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        List<String> distinctCommonSubjects = commonSubjects.stream()
                .filter(subject -> commonSubjects.stream()
                        .filter(s -> s.equals(subject))
                        .count() == students.size())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Common subjects attended by all students: " + distinctCommonSubjects);
    }
}
class Student {
    private String name;
    private List<String> subjects;

    public Student(String name, List<String> subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}