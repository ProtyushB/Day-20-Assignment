import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(5);

        students.add(new Student(2,"D",750));
        students.add(new Student(5,"B",650));
        students.add(new Student(3,"A",830));
        students.add(new Student(1,"C",920));
        students.add(new Student(4,"E",840));


       List<Employee> employees = students.stream().map(s -> new Employee(s.getRoll(),s.getName(),s.getMarks())).collect(Collectors.toList());

       for (Employee e:employees){
           System.out.println(e);
       }
    }
}
