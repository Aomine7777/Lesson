package part4.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Group  {
    private List<Student> students;

    public Group (){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }

    public List<Student> getStudentsByName(char letter){
        return students.stream()
                .filter(student -> student.getName().charAt(0) == letter)
                .collect(Collectors.toList());
    }
    public List<Student> getStudentsByCourse(int course){
        return students.stream()
                .filter(student -> student.getCourse() == course)
                .collect(Collectors.toList());
    }

}
