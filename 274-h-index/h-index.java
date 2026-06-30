class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;
        for(int i = n / 2 - 1; i >=0; i--){
            heapify(citations, n, i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = citations[i];
            citations[i] = citations[0];
            citations[0] = temp;
            heapify(citations, i, 0);
        }

        for(int x = 0; x < n; x++){
            if(citations[x] > x){
                h = x + 1; 
            }
        }

        return h;
    }


    public void heapify(int[] arr, int size, int l){
        int i = l;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < size && arr[left] < arr[l]){
            l = left;
        }

        if(right < size && arr[right] < arr[l]){
            l = right;
        }

        if(l != i){
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            heapify(arr, size, l);
        }
    }
}