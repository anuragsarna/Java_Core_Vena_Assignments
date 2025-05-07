import java.util.*;
import java.util.stream.Collectors;

public class Question55 {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Job1", "SUCCESS"),
                new Job("Job2", "FAILED"),
                new Job("Job3", "SUCCESS"),
                new Job("Job4", "FAILED"),
                new Job("Job5", "FAILED")
        );

        List<String> failedJobs = getFailedJobsInUppercase(jobs);

        System.out.println("Failed Jobs (uppercase, sorted): " + failedJobs);
    }

    public static List<String> getFailedJobsInUppercase(List<Job> jobs) {
        return jobs.stream()
                .filter(job -> "FAILED".equalsIgnoreCase(job.getStatus()))
                .map(job -> job.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    }
}

class Job {
    private String name;
    private String status;

    public Job(String name, String status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return name + " (" + status + ")";
    }
}
