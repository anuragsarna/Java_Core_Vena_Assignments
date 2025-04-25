package Question5_Abstraction;

abstract class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    abstract double calculateSalary();
    abstract String getDetails();
}
