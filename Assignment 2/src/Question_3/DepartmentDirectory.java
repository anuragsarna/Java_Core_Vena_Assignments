package Question_3;
import java.util.*;

public class DepartmentDirectory {
    private Map<String, List<Employee>> directory;

    public DepartmentDirectory(){
        directory = new HashMap<>();
    }

    public void addEmployee(Employee e){
        directory.computeIfAbsent(e.getDepartment(), k -> new ArrayList<>()).add(e);
    }

    public void sortDepartmentsBySalary(){
        for (List<Employee> employeeList : directory.values()) {
            Collections.sort(employeeList, new Comparator<Employee>() {
                @Override
                public int compare(Employee e1, Employee e2) {
                    return Double.compare(e2.getSalary(), e1.getSalary());
                }
            });
        }
    }

    public List<Employee> getTopPaidEmployees(int n) {
        List<Employee> allEmployees = new ArrayList<>();
        for (List<Employee> list : directory.values()) {
            allEmployees.addAll(list);
        }

        allEmployees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        return allEmployees.subList(0, Math.min(n, allEmployees.size()));
    }

    public void printDepartments() {
        for (String dept : directory.keySet()) {
            System.out.println("Department: " + dept);
            for (Employee e : directory.get(dept)) {
                System.out.println("  " + e);
            }
        }
    }
}
