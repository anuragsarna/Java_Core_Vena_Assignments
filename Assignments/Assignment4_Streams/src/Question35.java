import java.util.*;
import java.util.stream.Collectors;

class Employeee {
    String department;
    double salary;

    public Employeee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}

public class Question35 {
    public static void main(String[] args) {
        List<Employeee> employees = Arrays.asList(
                new Employeee("Engineering", 100000),
                new Employeee("Engineering", 120000),
                new Employeee("Marketing", 80000),
                new Employeee("Marketing", 90000),
                new Employeee("Sales", 75000)
        );

        // Calculate average salary by department
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(
                        Employeee::getDepartment,
                        Collectors.averagingDouble(Employeee::getSalary)
                ));

        // Print the result
        averageSalaries.forEach((department, avgSalary) ->
                System.out.println(department + ": " + avgSalary)
        );
    }
}
