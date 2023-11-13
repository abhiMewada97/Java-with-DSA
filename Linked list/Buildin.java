import java.util.LinkedList;

public class Buildin {
    
    public static void main(String []args){
        LinkedList <Integer> ll = new LinkedList<>();
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        
        LinkedList sec_ll = new LinkedList();
        sec_ll = (LinkedList) ll.clone();
        System.out.println(sec_ll);
        
        System.out.println(ll.get(2));
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        
        ll.clear();

        ll.indexOf("2");
    }
}
