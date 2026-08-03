class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int[] dp = new int[nums2.length+1];//dp solution.
        int ans = 0;// the final returning length of the repeated subarray in both arrays.

        for(int i = nums1.length - 1; i >= 0; i--){//two pointers approach. i
            for(int j = 0; j < nums2.length; j++){// j
                if(nums1[i] == nums2[j]){//check if they are the same.
                    dp[j] = 1 + dp[j+1];//se the dp[j] array to its righmost element + 1.
                }
                else{
                    dp[j] = 0;//otherwise set it to 0
                }

                ans = Math.max(ans, dp[j]);//for each iteration in n^2 loops, find the max.
            }
        }

        return ans;//return it.
    }
}