class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int[] ans = new int[n];

        for(int x : nums){
            right += x;
        }

        for(int i = 0; i <= n - 1; i++){
            right -= nums[i];

            ans[i] = Math.abs(left - right);

            left += nums[i];
        }

        return ans;
    }
}