PriorityQueue <Integer> pq = new PriorityQueue<>();

PriorityQueue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // comparator->collection in java


while(!pq.isEmpty()) {
    System.out.println(pq.peek().name+" --> "+ pq.peek().rank);  // O(1)
    pq.remove();  // O(logn)
}