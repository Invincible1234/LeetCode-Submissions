class Solution {
    public int singleNumber(int[] nums) {
        int cnt = 0;

        for(int n : nums){
            cnt ^= n;
        }
        return cnt;
    }
}