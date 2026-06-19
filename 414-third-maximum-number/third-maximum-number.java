class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;

        //Sorting Algorithm (Selection Sort, Quick Sort, MergeSort, Insertion Sort and HeapSort)
        for(int i = 0; i < n - 1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }

        int count = 1;
        int current = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            if(current != nums[i]){
                count += 1;
                current = nums[i];
            }

            if(count == 3){
                return current;
            }
        }

        return nums[n - 1];

    }
}