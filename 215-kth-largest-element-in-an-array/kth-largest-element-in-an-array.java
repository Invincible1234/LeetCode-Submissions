class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(); //use Priority Queue for MinHeap.

        for(int i = n / 2 - 1; i >= 0; i--){ //Build the heap
            heapify(nums, n, i);
        }
        for(int i = 0; i < k; i++){//input every digit into priority
            minHeap.offer(nums[i]);
        }

        for(int j = k; j < n; j++){//check through minheap and see if the current value is greater than the one we have and if so, remove that value and add the current one.
            if(nums[j] > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(nums[j]);
            }

        }

        return minHeap.peek();

    }

    public void heapify(int[] arr, int size, int smallest){
        int i = smallest;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] < arr[smallest]){
            smallest = left;
        }
        if(right < size && arr[right] < arr[smallest]){
            smallest = right;
        }

        if(smallest != i){
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapify(arr, size, smallest);
        }

    }
}