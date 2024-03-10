import java.util.*;

public class Insert_in_heap {
    
    static class Heap {
        ArrayList <Integer> list = new ArrayList<>();

        public void add(int data) {
            list.add(data);
            int child = list.size()-1;
            int par = (child-1)/2;
            while(list.get(par)<list.get(child)) {
                int temp = list.get(par);
                list.set(par, list.get(child));
                list.set(child, temp);

                child=par;
                par=(child-1)/2;
            }
        }
        
        public int peek() {
            return list.get(0);
        }
    }

    public static void main(String []args) {

        Heap pq = new Heap();
        pq.add(3);
        System.out.println(pq.peek());
        pq.add(4);
        System.out.println(pq.peek());
        pq.add(1);
        System.out.println(pq.peek());
        pq.add(1);
        System.out.println(pq.peek());

        
    }
}
