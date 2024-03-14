import java.util.*;

public class Remove_from_heap {

    static class Heap {
        
        ArrayList <Integer> list = new ArrayList<>();
        
        public void add(int data) {

            //add at last idx
            list.add(data);

            int x = list.size()-1; // child index
            int par = (x-1)/2;  // par index

            while(list.get(x) < list.get(par)) {
                // swap
                int temp = list.get(x);
                list.set(x,list.get(par));
                list.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        // Heapify
        private void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;  
            int minIdx = i;

            if(left < list.size() && list.get(minIdx) > left) {
                minIdx = left;
            }           

            if(right < list.size() && list.get(minIdx) > right) {
                minIdx = right; 
            }

            if(minIdx != i) {
                int temp = list.get(i);
                list.set(i,list.get(minIdx));
                list.set(minIdx, temp);

                heapify(minIdx);
            }
        }
        
        public int peek() {
            return list.get(0);
        }

        public int remove() {
            int data = list.get(0);

            // step1 swap first and last
            list.set(0,list.get(list.size()-1));
            list.set(list.size()-1, data);

            // step2 remove last
            list.remove(list.size()-1);
            
            // step3 remove last
            heapify(0); 
            return data;
        }

        public boolean isEmpty() {
            return list.size()==0;
        }
    }

    public static void main(String []args) {

        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while(!pq.isEmpty()) {
            System.out.print(pq.peek()+" ");
            pq.remove();
        }
    }
    
}
