class Solution {
    public int maximumProduct(int[] nums) {
        //sort the array.

        int n = nums.length;
        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(nums, n, i);//heapify that bitch.
        }

        for(int j = n - 1; j > 0; j--){
            int vox = nums[j];
            nums[j] = nums[0];
            nums[0] = vox;
            heapify(nums, j, 0);
        }

        return Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3], nums[0] * nums[1] * nums[n-1]);

    }

    private void heapify(int[] arr, int size, int largest){
        int i = largest;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < size && arr[right] > arr[largest]){
            largest = right;
        }

        if(arr[largest] != arr[i]){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, size, largest);
        }
    }
}