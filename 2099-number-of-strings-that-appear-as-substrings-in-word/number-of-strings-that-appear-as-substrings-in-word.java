class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0; //return the frequency count.

        for(String i : patterns){
            if(word.contains(i)){
                count += 1;
            }

        }
        return count;
    }
}