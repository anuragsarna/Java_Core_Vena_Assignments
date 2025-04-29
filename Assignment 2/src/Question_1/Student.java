package Question_1;

public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;
    private String branch;

    public Student(int id, String name, int age, String grade, String branch) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.branch = branch;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public int getAge() {return age;}
    public String getGrade() {return grade;}
    public String getBranch() {return branch;}

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + grade + " - " + branch;
    }
}
