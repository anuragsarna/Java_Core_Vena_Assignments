package Question_1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 20, "B", "CS"));
        students.add(new Student(2, "Bob", 21, "A", "ECE"));
        students.add(new Student(3, "Charlie", 19, "C", "ME"));
        students.add(new Student(4, "David", 22, "A", "CS"));
        students.add(new Student(5, "Eva", 20, "A", "ECE"));
        students.add(new Student(6, "Frank", 23, "D", "ME"));
        students.add(new Student(7, "Grace", 20, "B", "CS"));
        students.add(new Student(8, "Helen", 21, "C", "EEE"));
        students.add(new Student(9, "Ian", 22, "B", "ECE"));
        students.add(new Student(10, "Jack", 19, "C", "ME"));
        students.add(new Student(11, "Karen", 20, "A", "CS"));
        students.add(new Student(12, "Leo", 21, "D", "EEE"));
        students.add(new Student(13, "Mona", 20, "B", "CS"));
        students.add(new Student(14, "Nina", 22, "A", "ECE"));
        students.add(new Student(15, "Oscar", 23, "C", "ME"));

        Map<String, Integer> gradeOrder = Map.of(
                "A", 5,
                "B", 4,
                "C", 3,
                "D", 2,
                "F", 1
        );

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int branchCompare = s1.getBranch().compareTo(s2.getBranch());

                if (branchCompare == 0) {
                    int grade1 = gradeOrder.getOrDefault(s1.getGrade(), 0);
                    int grade2 = gradeOrder.getOrDefault(s2.getGrade(), 0);
                    return Integer.compare(grade2, grade1);
                } else {
                    return branchCompare;
                }
            }
        });

        System.out.println("Sorted Students:");
        System.out.println("---------------------");
        for (Student s : students) {
            System.out.println(s);
        }


    }
}
