class Solution {
    public int arrayPairSum(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int max = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[max]){
                    max = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
        }

        int res = 0;
        for(int c = 0; c < n; c += 2){
            res += nums[c];
        }
        return res;
    }
}