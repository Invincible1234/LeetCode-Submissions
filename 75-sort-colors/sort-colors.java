class Solution {
    public void sortColors(int[] nums) {
        //HeapSort.

        int n = nums.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(nums, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums, i, 0);
        }
        return;

    }

    public void heapify(int[] arr, int size, int largest){
        int i = largest;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] >= arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] >= arr[largest]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }
}