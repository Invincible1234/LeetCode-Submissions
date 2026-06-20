class Solution {
    public int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int counter = 0;

        for(char c : binary.toCharArray()){
            if(c == '1'){
                counter += 1;
            }
        }

        return counter;
    }
}