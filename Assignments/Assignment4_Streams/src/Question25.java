import java.util.Arrays;
import java.util.List;

public class Question25 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(new Person("Anurag",24),
                                            new Person("Ayush",17),
                                            new Person("Samarth",44),
                                            new Person("Aditi",55));

        List<String> names = people.stream()
                                    .filter(x -> x.getAge() > 18)
                                    .map(x -> x.getName())
                                    .toList();

        System.out.println(names);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
