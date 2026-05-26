class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> chars = new HashSet<>();
        int count = 0;

        for(char ch : word.toCharArray()){
            chars.add(ch);
        }

        for(char c = 'a'; c <= 'z'; c++){
            if(chars.contains(c) && chars.contains(Character.toUpperCase(c))){
                count += 1;
            }
        }

        return count;

    }
}