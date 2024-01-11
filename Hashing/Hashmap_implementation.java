import java.util.*;

public class Hashmap_implementation {
    
    static class HashMap<K, V>{
        
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;  //n
        private LinkedList<Node> buckets[];  //N  =  buckets.length

        @SuppressWarnings("unchecked")
        public HashMap(){
            this.n = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        public int hashFunction(K key){

            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length; 
        }

        public void searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];

            int di =0;
            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key){
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key, V value){
            int bi = hashFunction(key);  // bi bucket index 
            int di = searchInLL(key, bi);  // di data index 

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
        }
    }
}


// 16:25 start