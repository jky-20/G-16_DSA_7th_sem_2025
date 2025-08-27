package Lec_37_August_25_JCF;

public class heaps {
    static void heapify(int[] heap, int i){

        while(i > 0){
            int p = (i - 1) / 2;
            if(heap[i] > heap[p]){
                int t = heap[i];
                heap[i] = heap[p];
                heap[p] = t;
            }
            else{
                break;
            }
            i = p;
        }
    }
    static int deleteTop(int[] heap){
        int top = heap[0];
        

        return top;
    }
    static void heapifyDown(int[] heap, int n){
        int i = 0;
        while(i < n){
            int child1 = 2*i + 1, child2 = 2*i + 2;
            if(child1 >= n && child2 >= n){
                break;
            }
            if(child1 < n && child2 >= n){
                if(heap[i] < heap[child1]){
                    swap(heap, i, child1);  // implement yourself
                    i = child1;
                }
            }
            if(child1 <n && child2 < n){
                if(heap[i] >= heap[child1] && heap[i] >= heap[child2]){
                    break;
                }
                int child = i;
                if(heap[child1] > heap[child2]){
                    child = child1;
                }
                else{
                    child = child2;
                }
                swap(heap, i, child);   // implement yourself
                i = child;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,10,3,12};    // heap = {12,4,10,1,3,3}

        int[] heap = new int[arr.length];
        int i = 0;

        for(int val : arr){
            heap[i] = val;
            heapify(heap, i);
            i++;
        }
        for(int val : heap){
            System.out.print(val + " ");
        }
        // int top = deleteTop(heap);
        // delete in heap
        int last = i - 1;
        int top = heap[0];
        swap(heap, 0, last);    // implement yourself
        heapifyDown(heap, heap.length-1);
    }
}
