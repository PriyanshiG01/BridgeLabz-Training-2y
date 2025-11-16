package oops;
import java.util.*;

class Booking { String id; boolean vip; public Booking(String id,boolean vip){this.id=id;this.vip=vip;} public String toString(){return id + (vip? " (VIP)":"");} }

public class TicketReservation {
    public static void main(String[] args) {
        Set<String> users = new HashSet<>();
        List<Booking> bookings = new ArrayList<>();
        Queue<Booking> queue = new LinkedList<>();
        PriorityQueue<Booking> pq = new PriorityQueue<>((a,b)->Boolean.compare(b.vip,a.vip));

        users.add("U1");

        Booking b1 = new Booking("B1", false);
        Booking b2 = new Booking("B2", true);

        bookings.add(b1); bookings.add(b2);
        queue.add(b1);
        pq.add(b2);

        while (!pq.isEmpty()) System.out.println("Confirming " + pq.remove());
    }
}
