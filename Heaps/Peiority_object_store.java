import java.util.Comparator;
import java.util.PriorityQueue;

public class Peiority_object_store {

    // static class Student {
    static class Student implements Comparable<Student> {  //overriding
        String name;
        int rank;

        public Student (String name, int rank) {
            this.name = name;
            this.rank = rank;
        }
        
        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String []args) {

        PriorityQueue <Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student ("A", 1));
        pq.add(new Student ("B", 3));
        pq.add(new Student ("C", 6));
        pq.add(new Student ("D", 5));
        pq.add(new Student ("E", 7));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+" --> "+ pq.peek().rank);  // O(1)
            pq.remove();  // O(logn)
        }
    }
}