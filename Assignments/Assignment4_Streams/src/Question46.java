import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Worker {
    String name;
    double salary;
    int joiningYear;

    public Worker(String name, double salary, int joiningYear) {
        this.name = name;
        this.salary = salary;
        this.joiningYear = joiningYear;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getJoiningYear() {
        return joiningYear;
    }

    @Override
    public String toString() {
        return name + " (" + salary + ")";
    }
}

public class Question46 {
    public static void main(String[] args) {
        List<Worker> workers = Arrays.asList(
                new Worker("Alice", 50000, 2020),
                new Worker("Bob", 70000, 2020),
                new Worker("Charlie", 75000, 2021),
                new Worker("Diana", 60000, 2021),
                new Worker("Edward", 90000, 2022)
        );

        Map<Integer, Optional<Worker>> maxSalaryByYear = workers.stream()
                .collect(Collectors.groupingBy(
                        Worker::getJoiningYear,
                        Collectors.maxBy(Comparator.comparingDouble(Worker::getSalary))
                ));

        maxSalaryByYear.forEach((year, worker) ->
                System.out.println("Year " + year + ": " + worker.map(Worker::toString).orElse("No workers")));
    }
}
