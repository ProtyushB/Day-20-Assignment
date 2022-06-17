import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(2,"B",750));
        students.add(new Student(5,"A",950));
        students.add(new Student(4,"C",730));
        students.add(new Student(1,"D",830));

        System.out.println("***** Before Filter *****");
        System.out.println(students);

        List<Student> resList = students.stream().filter(student -> student.getMarks()>800).toList();

        System.out.println("***** After Filter *****");
        System.out.println(resList);

    }
}
