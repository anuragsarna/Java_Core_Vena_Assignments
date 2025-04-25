package Question6_StaticVSInstance;

public class Student {
    static int studentcount = 0;
    private int studentID;
    private String name;

    Student(String name){
        studentcount++;
        studentID = studentcount;
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Name : " + name + " , ID : " + studentID);
    }

    public static String totalStudents(){
        return ("Total Students are : " + studentcount);
    }
}
