package TMSnew.homework7.TMS.homework15.Task3;

import java.util.Iterator;
import java.util.List;

public class StudentService {
    public void processStudents(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            double average = calculateAverage(student);
            if (average < 3) {
                iterator.remove();
            } else {
                student.setCourse(student.getCourse() + 1);
            }
        }
    }

    private double calculateAverage(Student student) {
        int sum = 0;
        for (Integer grade : student.getGrades()) {
            sum += grade;
        }
        return (double) sum / student.getGrades().size();
    }
    public void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }
}