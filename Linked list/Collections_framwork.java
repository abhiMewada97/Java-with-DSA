import java.util.LinkedList;

public class Collections_framwork {
    
    public static void main(String []args){
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        
        System.out.println(ll.get(2));
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        
        ll.clear();
    }
}
