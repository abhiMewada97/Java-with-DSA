import java.util.*;

public class Deque_interface {
    
    public static void main(String []args) {

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);

        System.out.println(deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);

        System.out.println("first element "+ deque.getFirst());
        System.out.println("last element "+ deque.getLast());
    }
}
