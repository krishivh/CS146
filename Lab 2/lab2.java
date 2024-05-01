class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] array_s = s.toCharArray();
        char[] array_t = t.toCharArray();

        Arrays.sort(array_s);
        Arrays.sort(array_t);

        if(Arrays.equals(array_s, array_t)){
            return true;
        }

        else{
            return false;
        }

    }
}
