class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i < n; i++){
            nums1[i+m] = nums2[i];
        }

        int j = nums1.length;

        for(int i = 0; i < j+1; i++){
            int min = i;
            for(int x = i+1; x < j; x++){
                if(nums1[x] < nums1[min]){
                    int temp = nums1[x];
                    nums1[x] = nums1[min];
                    nums1[min] = temp;
                }
            }
        }

    }
}