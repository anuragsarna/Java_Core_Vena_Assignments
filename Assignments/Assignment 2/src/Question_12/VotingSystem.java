package Question_12;

import java.util.*;

public class VotingSystem {
    private final Map<String, Integer> voteCountMap = new HashMap<>();

    // Tally one vote for a candidate
    public void castVote(String candidate) {
        if (voteCountMap.containsKey(candidate)) {
            int currentVotes = voteCountMap.get(candidate);
            voteCountMap.put(candidate, currentVotes + 1);
        } else {
            voteCountMap.put(candidate, 1);
        }

    }

    // Print results sorted by vote count descending
    public void printResults() {
        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(voteCountMap.entrySet());

        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue())); // Descending order

        System.out.println("Election Results:");
        for (Map.Entry<String, Integer> entry : sortedList) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public static void main(String[] args) {
        VotingSystem voting = new VotingSystem();

        voting.castVote("Alice");
        voting.castVote("Bob");
        voting.castVote("Alice");
        voting.castVote("Charlie");
        voting.castVote("Alice");
        voting.castVote("Bob");

        voting.printResults();
    }
}
