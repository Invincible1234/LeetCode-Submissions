class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> last = new HashMap<>();//create a new hashmap.
        for(int i = 0; i < nums.length; i++){//run a forloop through the array.
            Integer j = last.put(nums[i], i);//set Integer j to map last.
            if(j != null && i-j <= k){//check the given conditions.
                return true;//if correct, return true.
            }
        }
        return false;//otherwise return false.
    }
}