import java.util.*;
import java.util.stream.*;

public class Question34 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("Diana", "HR"),
                new Employee("Evan", "Finance")
        );

        Map<String, Long> countByDepartment = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.counting()
                ));

        countByDepartment.forEach((department, count) ->
                System.out.println(department + ": " + count));
    }
}

class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }
}
