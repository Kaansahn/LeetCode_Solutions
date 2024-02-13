class Solution {
    private int lo, max_len;

    public String longestPalindrome(String s) {
       int len = s.length();
       if(len < 2) return s;

        for(int i = 0; i < len; i++){
            extendPalindrome(s, i, i); // assume odd length
            extendPalindrome(s, i, i+1); //assume even length
        }
        return s.substring(lo, max_len + lo);
    }
    
    private void extendPalindrome(String s, int j, int k){
       while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
           j--;
           k++;
       }
       if(max_len < k - j - 1){
           max_len = k - j - 1;
           lo = j + 1;
       }
    }
}