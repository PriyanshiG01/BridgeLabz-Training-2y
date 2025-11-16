package oops;
import java.util.*;

class Player { String id; int points; public Player(String id,int p){this.id=id;this.points=p;} @Override public boolean equals(Object o){return o instanceof Player && ((Player)o).id.equals(id);} @Override public int hashCode(){return id.hashCode();} public String toString(){return id+":"+points;} }

public class Tournament {
    public static void main(String[] args) {
        Set<Player> players = new HashSet<>();
        players.add(new Player("P1",0)); players.add(new Player("P2",0));

        Queue<String> matches = new LinkedList<>();
        matches.add("P1 vs P2");

        List<String> results = new ArrayList<>();

        Comparator<Player> cmp = Comparator.comparingInt((Player p)->p.points).reversed().thenComparing(p->p.id);
        NavigableSet<Player> leaderboard = new TreeSet<>(cmp);

    }
}
