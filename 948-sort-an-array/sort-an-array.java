class Solution {
    public int[] sortArray(int[] nums) {
        int heap = nums.length; //get the length of the array

        for(int i = heap/2 - 1; i >= 0; i--){ // start from the last parent and go upwards.
            heapify(nums, heap, i); //heapify it
        }

        for(int i = heap - 1; i > 0; i--){//to sort it completely in a certain order swap the firt and last element.
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums, i, 0);//shrink the size by i once the last index is done.
        }

        return nums;//return the final result.

    }

    public void heapify(int[] arr, int size, int i){ //arguments are array, it size and index.
        int largest = i; //parent node
        int left = 2 * i + 1; //left child
        int right = 2 * i + 2; //right child (all property of heap)
        //check if left is less than the size and if it is greater than its parent.
        if(left < size && arr[left] > arr[largest]){
            largest = left; //if so left is now the parent
        }
        //check if the right is lesss than the size and if it is greater than its parent.
        if(right < size && arr[right] > arr[largest]){
            largest = right; //if so right is now the parent.
        }

        if(largest != i){ //if the largest is not equal to i after the swap with either left and right.
            int temp = arr[i]; //do the swap after the comparision.
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);//keep doing it until so.
        }
    }
}