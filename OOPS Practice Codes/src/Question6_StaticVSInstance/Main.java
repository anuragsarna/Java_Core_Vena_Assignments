package Question6_StaticVSInstance;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();

        System.out.println(Student.totalStudents());
    }
}
