package Question_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DepartmentDirectory directory = new DepartmentDirectory();

        directory.addEmployee(new Employee(1, "Alice", 80000, "HR"));
        directory.addEmployee(new Employee(2, "Bob", 95000, "IT"));
        directory.addEmployee(new Employee(3, "Charlie", 70000, "Finance"));
        directory.addEmployee(new Employee(4, "David", 85000, "IT"));
        directory.addEmployee(new Employee(5, "Eve", 75000, "HR"));

        directory.sortDepartmentsBySalary();

        System.out.println("Department-wise Sorted Employees:");
        directory.printDepartments();

        System.out.println("\nTop 3 Paid Employees:");
        List<Employee> topPaid = directory.getTopPaidEmployees(3);
        for (Employee e : topPaid) {
            System.out.println(e);
        }
    }

}

