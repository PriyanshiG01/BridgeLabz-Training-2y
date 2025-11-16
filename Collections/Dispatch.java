package oops;
import java.util.*;

class RideRequest implements Comparable<RideRequest> {
    String id; int priority; double distance;
    public RideRequest(String id, int priority, double distance){this.id=id;this.priority=priority;this.distance=distance;}
    public int compareTo(RideRequest o){return Integer.compare(o.priority, this.priority);}
    public String toString(){return id+"(p"+priority+",d"+distance+")";}
}
class Driver { String id; public Driver(String id){this.id=id;} public String toString(){return id;} }

public class Dispatch {
    public static void main(String[] args) {
        Queue<RideRequest> pending = new LinkedList<>();
        pending.add(new RideRequest("R1",1,5.1));
        pending.add(new RideRequest("R2",5,0.4));
        pending.add(new RideRequest("R3",3,2.0));

        Set<Driver> available = new HashSet<>();
        available.add(new Driver("D1")); available.add(new Driver("D2"));

        List<String> completed = new ArrayList<>();
        PriorityQueue<RideRequest> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(pending);

        while (!priorityQueue.isEmpty() && !available.isEmpty()) {
            RideRequest r = priorityQueue.remove();
            Iterator<Driver> it = available.iterator();
            Driver d = it.next();
            it.remove();
            System.out.println("Assign " + d + " to " + r);
            completed.add(r.id);
        }
        System.out.println("Completed rides: " + completed);
    }
}
