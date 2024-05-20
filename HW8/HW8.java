import java.util.HashMap;

class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> letters = new HashMap<>();
        for (char ch : s.toCharArray()){
            letters.put(ch, letters.getOrDefault(ch, 0) + 1);
        }
        
        int length = 0;
        int odd = 0; 

        if (letters.size() == 1) {
            return letters.get(s.charAt(0));
        }

        for (int i : letters.values()) {
            if (i > 1) {
                if (i % 2 == 0) {
                    length += i;
                } else {
                    length += i - 1;
                    odd++;
                }
            } else {
                odd++;
            }
        }
        if (odd > 0) {
            length += 1;
        }
        return length;

    }
}