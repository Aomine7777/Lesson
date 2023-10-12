package part4.Task1;

public class Student extends Human {
    private int course;
    private String speciality;

    public Student(String name, int age, int course, String speciality) {
        super(name, age);
        this.course = course;
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return "Студент{" + " Ім'я: " + getName() +
                ", Курс = " + course +
                ", Спеціальніть = '" + speciality + '\'' +
                '}';
    }
}
