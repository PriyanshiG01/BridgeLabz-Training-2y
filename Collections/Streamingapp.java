package oops;
import java.util.*;

class Movie { String id; String genre; public Movie(String id,String g){this.id=id;this.genre=g;} public String toString(){return id+"("+genre+")";} }

public class Streamingapp {
    public static void main(String[] args) {
        Deque<Movie> watchHistory = new ArrayDeque<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> uniqueGenres = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();

        Movie m = new Movie("M1","Action");
        upNext.add(m);
       
        Movie current = upNext.remove();
        watchHistory.push(current);
        uniqueGenres.add(current.genre);
    }
}
