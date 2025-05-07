import java.util.*;
import java.util.stream.Collectors;

class Comment {
    String user;
    String content;

    public Comment(String user, String content) {
        this.user = user;
        this.content = content;
    }

    public String getUser() {
        return user;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Comment{" + "user='" + user + "', content='" + content + "'}";
    }
}

public class Question47 {
    public static void main(String[] args) {
        List<Comment> comments = Arrays.asList(
                new Comment("Alice", "This is a great post!"),
                new Comment("Bob", "Thanks for sharing."),
                new Comment("Alice", "I agree, this is really helpful."),
                new Comment("Charlie", "Interesting perspective."),
                new Comment("Alice", "I learned a lot from this."),
                new Comment("Bob", "Looking forward to more!")
        );

        // Count comments by each user
        Map<String, Long> commentCountByUser = comments.stream()
                .collect(Collectors.groupingBy(Comment::getUser, Collectors.counting()));

        // Print the result
        commentCountByUser.forEach((user, count) ->
                System.out.println(user + ": " + count));
    }
}

