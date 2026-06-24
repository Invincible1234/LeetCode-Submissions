class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;

        if(n < 2){
            return nums;
        }

        int foid = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                int temp = nums[i];
                nums[i] = nums[foid];
                nums[foid] = temp;
                foid +=1;
            }
        }
        return nums;
    }

}