package Question_9;

import java.util.*;

class Player {
    String name;
    int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Override equals and hashCode for correct TreeSet and HashMap behavior
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return name.equals(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Leaderboard {
    private TreeSet<Player> leaderboard;
    private Map<String, Player> playerMap;

    public Leaderboard() {
        leaderboard = new TreeSet<>((a, b) -> {
            if (b.score != a.score) {
                return b.score - a.score; // Descending score
            }
            return a.name.compareTo(b.name); // Ascending name if tie
        });
        playerMap = new HashMap<>();
    }

    public void addOrUpdatePlayer(String name, int newScore) {
        if (playerMap.containsKey(name)) {
            Player oldPlayer = playerMap.get(name);
            leaderboard.remove(oldPlayer);
            oldPlayer.score = newScore;
            leaderboard.add(oldPlayer);
        } else {
            Player newPlayer = new Player(name, newScore);
            leaderboard.add(newPlayer);
            playerMap.put(name, newPlayer);
        }
    }

    public void printLeaderboard() {
        for (Player player : leaderboard) {
            System.out.println(player.name + ": " + player.score);
        }
    }
}
