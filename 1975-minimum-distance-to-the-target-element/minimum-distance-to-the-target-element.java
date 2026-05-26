class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int dis = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                dis = Math.min(dis, Math.abs(i - start));
            }
        }
        return dis;
    }
}