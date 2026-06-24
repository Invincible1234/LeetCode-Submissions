class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> fin = new ArrayList<>();//final 2D list of permutations.
        List<Integer> current = new ArrayList<>();//keep track of current number.

        backtrack(nums, current, fin);//helper recurrsive function

        return fin;        //return the final 2D array.
    }

    public void backtrack(int[] n, List<Integer> curr, List<List<Integer>> res){
        if(curr.size() == n.length){//checks if the size of the array equals to size of the curr
            res.add(new ArrayList<>(curr));//adds whatever is in the curr.
            return;
        }

        for(int i : n){ //for every element in nums
            if(curr.contains(i)){//it checks for the unsused numbers and used numbers.
                continue;//if so, continues the loop.
            }
            curr.add(i);//adds the current element
            backtrack(n, curr, res);//recurrsively processes it again.
            curr.remove(curr.size() - 1);//undos the step and checks differnt permutations.
        }

        
    }
}