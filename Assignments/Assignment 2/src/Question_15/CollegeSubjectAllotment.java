package Question_15;
import java.util.*;

public class CollegeSubjectAllotment {
    // Map to store subjects allotted to each student
    private Map<String, List<String>> studentToSubjects = new HashMap<>();

    // Reverse map to store students who chose each subject
    private Map<String, List<String>> subjectToStudents = new HashMap<>();

    // Add a student with their list of subjects
    public void addStudentSubjects(String student, List<String> subjects) {
        studentToSubjects.put(student, subjects);

        for (String subject : subjects) {
            subjectToStudents.computeIfAbsent(subject, k -> new ArrayList<>()).add(student);
        }
    }

    // Get subjects allotted to a student
    public List<String> getSubjectsOfStudent(String student) {
        return studentToSubjects.getOrDefault(student, Collections.emptyList());
    }

    // Get students who chose a specific subject
    public List<String> getStudentsOfSubject(String subject) {
        return subjectToStudents.getOrDefault(subject, Collections.emptyList());
    }

    public static void main(String[] args) {
        CollegeSubjectAllotment allotment = new CollegeSubjectAllotment();

        allotment.addStudentSubjects("Alice", Arrays.asList("Math", "Physics"));
        allotment.addStudentSubjects("Bob", Arrays.asList("Chemistry", "Math"));
        allotment.addStudentSubjects("Charlie", Arrays.asList("Biology", "Physics"));

        System.out.println("Subjects of Alice: " + allotment.getSubjectsOfStudent("Alice"));
        System.out.println("Students who chose Math: " + allotment.getStudentsOfSubject("Math"));
        System.out.println("Students who chose Physics: " + allotment.getStudentsOfSubject("Physics"));
    }
}


