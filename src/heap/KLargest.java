package heap;

import java.util.PriorityQueue;

/**
 *K smallest - Max heap
 * K largest - Min Heap
 * */
public class KLargest {
    public static void main(String[] args) {

        int[] arrayOfNumbers = {23,34,1222,34324, 809,923823, 7,3,423,43, 2342};
        getKLargest(arrayOfNumbers,5);

    }

    public static void getKLargest(int[] arr, int k) {
        PriorityQueue<Integer> minheap = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            minheap.add(arr[i]); // O(klogn)
        }

        for (int i = k; i < arr.length; i++) {
            minheap.add(arr[i]);
            if (minheap.size() > k) {
                minheap.poll(); // O((n-k)* log k)
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = minheap.poll();
            System.out.println(res[i]);
        }


    }
}
