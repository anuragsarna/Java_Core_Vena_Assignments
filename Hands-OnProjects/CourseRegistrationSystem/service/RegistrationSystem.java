package service;

import model.Course;
import model.Student;

import java.util.*;
import java.util.stream.Collectors;

public class RegistrationSystem {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();

    public void addStudent(Student student) {
        students.putIfAbsent(student.getId(), student);
    }

    public void addCourse(Course course) {
        courses.putIfAbsent(course.getCourseId(), course);
    }

    public String register(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student == null || course == null) return "Invalid student or course ID.";

        if (course.getEnrolledStudents().contains(student))
            return "Student already enrolled.";

        if (course.getWaitlist().contains(student))
            return "Student already waitlisted.";

        if (course.isFull()) {
            course.getWaitlist().add(student);
            return "Course is full. Student added to waitlist.";
        } else {
            course.getEnrolledStudents().add(student);
            return "Student successfully enrolled.";
        }
    }

    public String drop(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student == null || course == null) return "Invalid student or course ID.";

        if (course.getEnrolledStudents().remove(student)) {
            if (!course.getWaitlist().isEmpty()) {
                Student promoted = course.getWaitlist().poll();
                course.getEnrolledStudents().add(promoted);
            }
            return "Student dropped successfully.";
        } else if (course.getWaitlist().remove(student)) {
            return "Student removed from waitlist.";
        } else {
            return "Student not found in course.";
        }
    }

    public List<Student> listStudentsInCourse(String courseId) {
        Course course = courses.get(courseId);
        if (course == null) return new ArrayList<>();
        return new ArrayList<>(course.getEnrolledStudents());
    }

    public List<Student> listStudentsByBranch(String branch) {
        List<Student> result = new ArrayList<>();
        for (Student s : students.values()) {
            if (s.getBranch().equalsIgnoreCase(branch)) {
                result.add(s);
            }
        }
        return result;
    }


    public List<Course> listCoursesSortedByEnrollment() {
        List<Course> courseList = new ArrayList<>(courses.values());
        courseList.sort(new Comparator<Course>() {
            @Override
            public int compare(Course c1, Course c2) {
                return Integer.compare(c2.getEnrolledStudents().size(), c1.getEnrolledStudents().size());
            }
        });
        return courseList;
    }


    public List<Course> filterCoursesByCredits(int credits) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses.values()) {
            if (c.getCredits() == credits) {
                result.add(c);
            }
        }
        return result;
    }


    public List<Course> filterCoursesByInstructor(String instructorName) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses.values()) {
            if (c.getInstructorName().equalsIgnoreCase(instructorName)) {
                result.add(c);
            }
        }
        return result;
    }

}
