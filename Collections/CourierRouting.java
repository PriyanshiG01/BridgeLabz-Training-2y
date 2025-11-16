package oops;
import java.util.*;

class Parcel { String id; int priority; public Parcel(String id,int priority){this.id=id;this.priority=priority;} public String toString(){return id; } }

public class CourierRouting {
    public static void main(String[] args) {
        PriorityQueue<Parcel> pq = new PriorityQueue<>((a,b)->Integer.compare(b.priority,a.priority));
        Set<String> assignedIDs = new HashSet<>();
        List<Parcel> completed = new ArrayList<>();
        Queue<Parcel> normalQueue = new LinkedList<>();

        Parcel p1 = new Parcel("C1", 5);
        if (assignedIDs.add(p1.id)) pq.add(p1);

       
        Parcel next = pq.poll();
        completed.add(next);
    }
}
