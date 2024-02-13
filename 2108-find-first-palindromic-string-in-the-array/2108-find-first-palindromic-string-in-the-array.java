class Solution {
    public String firstPalindrome(String[] words) {
        for(int i = 0; i < words.length; i++){
            String s = words[i];
            int s_len = s.length();
            
            if(s_len < 2) return words[i];
            
            int j = s_len / 2;
            
            if(s_len % 2 != 0) {
                if(isPalindromic(s, j, j)) return words[i];
            }else{
                if(isPalindromic(s, j-1, j)) return words[i];
            }
        }
        return new String();
    }

    private boolean isPalindromic(String s, int j, int k){
        while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)){
            j--;
            k++;
        }
        if(j+1 == 0 && k == s.length()){
            return true;
        }
        return false;
    }
}