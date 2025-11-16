package oops;
import java.util.*;

class Patient { String id; public Patient(String id){this.id=id;} public String toString(){return id;} }

public class Hospital {
    public static void main(String[] args) {
        Set<Patient> admitted = new HashSet<>();
        Queue<Patient> waiting = new LinkedList<>();
        Deque<Patient> discharged = new ArrayDeque<>();
        List<Patient> history = new ArrayList<>();

        Patient p = new Patient("P1");
        admitted.add(p); waiting.add(p);
        Patient cur = waiting.remove();
        System.out.println("Treating " + cur);
        admitted.remove(cur);
        discharged.push(cur);
        history.add(cur);

        if (!discharged.isEmpty()) {
            Patient r = discharged.pop();
            admitted.add(r);
            waiting.add(r);
        }
    }
}
