package main;

import java.util.List;

import model.Course;
import model.Student;
import service.RegistrationSystem;

public class Main {
    public static void main(String[] args) {
        RegistrationSystem system = new RegistrationSystem();

        // Add Students
        system.addStudent(new Student("S1", "Alice", "alice@example.com", 2, "CSE"));
        system.addStudent(new Student("S2", "Bob", "bob@example.com", 3, "ECE"));
        system.addStudent(new Student("S3", "Charlie", "charlie@example.com", 2, "CSE"));
        system.addStudent(new Student("S4", "Diana", "diana@example.com", 1, "CSE"));

        // Add Courses
        system.addCourse(new Course("CSE101", "DSA", "Dr. Smith", 2, 4));
        system.addCourse(new Course("ECE201", "Signals", "Dr. Ray", 2, 3));

        // Registrations
        System.out.println("== REGISTRATION ==");
        System.out.println(system.register("S1", "CSE101"));
        System.out.println(system.register("S2", "CSE101"));
        System.out.println(system.register("S3", "CSE101"));
        System.out.println(system.register("S3", "CSE101"));
        System.out.println(system.register("S1", "CSE101"));

        // Drop and promotion
        System.out.println("\n== DROPPING ==");
        System.out.println(system.drop("S1", "CSE101"));
        System.out.println(system.drop("S4", "CSE101"));

        // List students in CSE101
        System.out.println("\n== STUDENTS IN CSE101 ==");
        List<Student> courseStudents = system.listStudentsInCourse("CSE101");
        for (Student s : courseStudents) {
            System.out.println(s.getName() + " (" + s.getBranch() + ")");
        }

        // List students by branch
        System.out.println("\n== STUDENTS IN CSE BRANCH ==");
        List<Student> cseStudents = system.listStudentsByBranch("CSE");
        for (Student s : cseStudents) {
            System.out.println(s.getName());
        }

        // List courses sorted by enrollment
        System.out.println("\n== COURSES SORTED BY ENROLLMENT ==");
        for (var c : system.listCoursesSortedByEnrollment()) {
            System.out.println(c.getCourseId() + ": " + c.getEnrolledStudents().size() + " enrolled");
        }

        // Filter by credits
        System.out.println("\n== COURSES WITH 4 CREDITS ==");
        for (var c : system.filterCoursesByCredits(4)) {
            System.out.println(c.getCourseName());
        }

        // Filter by instructor
        System.out.println("\n== COURSES BY DR. SMITH ==");
        for (var c : system.filterCoursesByInstructor("Dr. Smith")) {
            System.out.println(c.getCourseName());
        }
    }
}
