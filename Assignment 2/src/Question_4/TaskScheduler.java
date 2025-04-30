package Question_4;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

class Task {
    String name;
    int priority;
    LocalDate deadline;

    public Task(String name, int priority, LocalDate deadline) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + ", deadline=" + deadline + "}";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {

        Comparator<Task> taskComparator = (t1, t2) -> {
            int deadlineComparison = t1.deadline.compareTo(t2.deadline);
            if (deadlineComparison != 0) {
                return deadlineComparison;
            }

            return Integer.compare(t2.priority, t1.priority);
        };

        PriorityQueue<Task> taskQueue = new PriorityQueue<>(taskComparator);

        taskQueue.add(new Task("Submit report", 2, LocalDate.of(2025, 5, 2)));
        taskQueue.add(new Task("Finish project", 3, LocalDate.of(2025, 5, 1)));
        taskQueue.add(new Task("Prepare slides", 1, LocalDate.of(2025, 5, 1)));
        taskQueue.add(new Task("Email client", 5, LocalDate.of(2025, 5, 3)));

        System.out.println("Tasks in execution order:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
