import java.util.LinkedList;
import java.util.Queue;

public class builtin {

        // Queue is framwork 
        // we can not create object of framwork
        // two class implement Queue -> LinkedList & ArrayDeque
 
    Queue<Integer> q = new LinkedList<>();
    
     Queue<Integer> q = new ArrayDeque<>();

        q.add(1);

        q.isEmpty();
        q.peek();
        q.remove();
}