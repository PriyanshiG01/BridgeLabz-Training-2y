package oops;
import java.util.*;

public class FeedbackAnalysis {
    public static void main(String[] args) {
        List<String> allFeedback = new ArrayList<>();
        Set<String> unique = new LinkedHashSet<>();
        Queue<String> processQueue = new LinkedList<>();
        Deque<String> recentStack = new ArrayDeque<>();

        allFeedback.add("Good");
        allFeedback.add("Good");
        unique.addAll(allFeedback);
        processQueue.addAll(unique);

        while(!processQueue.isEmpty()) {
            String f = processQueue.remove();
            recentStack.push(f);
            System.out.println("Processing: "+f);
        }
    }
}

