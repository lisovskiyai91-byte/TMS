package TMSnew.homework7.TMS.homework15.Task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", "Java-1", 1, Arrays.asList(5,4,5)));
        students.add(new Student("Ivan", "Java-1", 1, Arrays.asList(2,2,3)));
        students.add(new Student("Oleg", "Java-2", 2, Arrays.asList(4,5,5)));
        StudentService service = new StudentService();
        service.processStudents(students);
        service.printStudents(students,2);
    }
}
