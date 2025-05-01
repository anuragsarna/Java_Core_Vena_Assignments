package Question_8;

import java.util.*;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Manager {
    String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return Objects.equals(name, manager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}

public class EmployeeHierarchy {

    Map<Manager, TreeMap<Integer, List<Employee>>> hierarchy = new HashMap<>();

    public void addEmployee(Manager manager, int level, Employee employee) {
        hierarchy
                .computeIfAbsent(manager, k -> new TreeMap<>())
                .computeIfAbsent(level, k -> new ArrayList<>())
                .add(employee);
    }

    public void printHierarchy() {
        for (Map.Entry<Manager, TreeMap<Integer, List<Employee>>> entry : hierarchy.entrySet()) {
            Manager manager = entry.getKey();
            System.out.println("----------------------------");
            System.out.println("Manager: " + manager);
            TreeMap<Integer, List<Employee>> levelMap = entry.getValue();

            for (Map.Entry<Integer, List<Employee>> levelEntry : levelMap.entrySet()) {
                Integer level = levelEntry.getKey();
                List<Employee> employees = levelEntry.getValue();
                System.out.println("  Level " + level + ": " + employees);
            }
        }
    }

    public static void main(String[] args) {
        EmployeeHierarchy eh = new EmployeeHierarchy();

        Manager m1 = new Manager("Alice");
        Manager m2 = new Manager("Alice");

        eh.addEmployee(m1, 1, new Employee("John"));
        eh.addEmployee(m1, 2, new Employee("Kevin"));
        eh.addEmployee(m1, 1, new Employee("Steve"));
        eh.addEmployee(m2, 1, new Employee("Sara"));
        eh.addEmployee(m2, 3, new Employee("Diana"));

        eh.printHierarchy();
    }
}

