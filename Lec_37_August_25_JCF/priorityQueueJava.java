package Lec_37_August_25_JCF;

import java.util.PriorityQueue;

public class priorityQueueJava {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->Integer.compare(b, a));

        minHeap.add(10);
        minHeap.addAll(maxHeap);
        minHeap.peek();
        minHeap.poll();
        minHeap.isEmpty();
        minHeap.size();
        
    }
}
