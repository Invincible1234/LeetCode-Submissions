class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for(int i : nums){
            if(seen.contains(i)){
                return true;
            }
            seen.add(i);
        }

        return false;
    }
}