class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>(); //create a seen hashset.
        Set<String> rep = new HashSet<>();
        for(int i = 0; i + 10 <= s.length(); i++){
            String x = s.substring(i, i+10);
            if(!seen.add(x)){
                rep.add(x);
            }
        }

        return new ArrayList<>(rep);
    }
}