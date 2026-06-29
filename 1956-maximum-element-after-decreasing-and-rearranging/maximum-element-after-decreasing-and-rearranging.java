class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        //Heapsort approach.
        int x = 1;

        int n = arr.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heapify(arr, i, 0);
        }

        for(int h : arr){
            if(h >= x){
                x +=1;
            }
        }
        return x - 1;
        
    }

    public void heapify(int[] arr, int size, int largest){
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