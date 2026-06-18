class Solution {
    public int findTheWinner(int n, int k) {
        return recursion(n,k) + 1;
    }
    //Recursion solution. Same as bottom up DP but done recurssively, instead of a iteratively.
    public int recursion(int n, int k){
        if(n == 1){
            return 0;
        }

        return (recursion(n - 1, k) + k) % n;
    }
}