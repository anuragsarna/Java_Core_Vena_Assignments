package model;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private String email;
    private int year;
    private String branch;

    public Student(String id, String name, String email, int year, String branch) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.year = year;
        this.branch = branch;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }

    public String getBranch() {
        return branch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id.equals(student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareToIgnoreCase(other.name);
    }
}
