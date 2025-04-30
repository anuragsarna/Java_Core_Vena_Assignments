package Question_9;

public class Main {
    public static void main(String[] args) {
        Leaderboard lb = new Leaderboard();
        lb.addOrUpdatePlayer("Alice", 100);
        lb.addOrUpdatePlayer("Bob", 150);
        lb.addOrUpdatePlayer("Alice", 200);

        lb.printLeaderboard();
    }
}

