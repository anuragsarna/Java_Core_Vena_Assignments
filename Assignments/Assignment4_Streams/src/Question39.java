import java.util.*;
import java.util.stream.Collectors;

public class Question39 {
    public static void main(String[] args) {
        List<People> people = Arrays.asList(
                new People("Alice", 18),
                new People("Bob", 25),
                new People("Charlie", 35),
                new People("Diana", 45),
                new People("Edward", 60)
        );

        Map<String, List<People>> groupedByAge = groupByAgeGroup(people);

        groupedByAge.forEach((ageGroup, persons) -> {
            System.out.println(ageGroup + " → " + persons);
        });
    }

    public static Map<String, List<People>> groupByAgeGroup(List<People> people) {
        return people.stream()
                .collect(Collectors.groupingBy(person -> {
                    if (person.getAge() < 20) return "<20";
                    else if (person.getAge() <= 40) return "20-40";
                    else return "40+";
                }));
    }
}

class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
