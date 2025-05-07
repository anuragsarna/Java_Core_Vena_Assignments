import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question32 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Ashish",81),
                new Student("Apoorva",75),
                new Student("Farooq",67),
                new Student("Somil",91),
                new Student("Anurag",95),
                new Student("Vivan",45)
        );

        List<Student> result = students.stream()
                .filter(x -> x.getGrade() > 80)
                .sorted(Comparator.comparing(Student::getName))
                .toList();

        for(Student name : result){
            System.out.println(name.getName());
        }
    }
}

class Student {
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}
