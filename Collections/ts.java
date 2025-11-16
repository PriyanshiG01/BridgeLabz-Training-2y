package oops;
import java.util.*;

class Team { String name; int points; public Team(String n,int p){name=n;points=p;} @Override public boolean equals(Object o){return o instanceof Team && ((Team)o).name.equals(name);} @Override public int hashCode(){return name.hashCode();} public String toString(){return name+":"+points;} }

class Match { Team a,b; public Match(Team a, Team b){this.a=a;this.b=b;} public String toString(){return a.name+" vs "+b.name;} }

public class ts {
    public static void main(String[] args) {
        Set<Team> teams = new HashSet<>();
        Team t1 = new Team("T1",0), t2 = new Team("T2",0);
        teams.add(t1); teams.add(t2);

        Queue<Match> matches = new LinkedList<>();
        matches.add(new Match(t1,t2));

        List<String> results = new ArrayList<>();
        Comparator<Team> rankingCmp = Comparator.comparingInt((Team tm)->tm.points).reversed().thenComparing(tm->tm.name);
        TreeSet<Team> leaderboard = new TreeSet<>(rankingCmp);

        Match m = matches.remove();
       
        t1.points += 3;
        results.add(m.toString() + " -> T1 wins");
        leaderboard.addAll(teams);
        System.out.println("Leaderboard: " + leaderboard);
    }
}
