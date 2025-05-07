import java.util.*;
import java.util.stream.Collectors;

class Item {
    String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Order1 {
    List<Item> items;

    public Order1(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

public class Question36 {
    public static void main(String[] args) {

        List<Order1> orders = Arrays.asList(
                new Order1(Arrays.asList(new Item("Apple"), new Item("Banana"))),
                new Order1(Arrays.asList(new Item("Orange"), new Item("Grapes"))),
                new Order1(Arrays.asList(new Item("Pineapple")))
        );

        List<String> itemNames = orders.stream()
                .flatMap(order -> order.getItems().stream())
                .map(Item::getName)
                .collect(Collectors.toList());

        itemNames.forEach(System.out::println);
    }
}

