class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();//create a new hashset.
        for(int	x:nums) s.add(x);//add every element to the hashset.
        int best=0;//best
        for(int	x:s)if(!s.contains(x-1)){//for every element in the hashset, check if the hashset doesn't contain the previous element.
            int y=x;//if so set the current element to y
            while(s.contains(y))y++;//while it does contain y increment y by 1.
            best=Math.max(best,y-x);//find the max during each iteration of the loop.
        }
        return best;//retunr the longest consecutive sequence.

    }
}