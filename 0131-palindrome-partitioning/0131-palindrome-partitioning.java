class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s);
        return list;
    }

    private void backtrack(List<List<String>> list, List<String> tempList, String s){
        if(s == null || s.length() == 0){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int i = 1; i <= s.length(); i++){
            String temp = s.substring(0, i);
            if(!isPalindrome(temp)) continue;
            tempList.add(temp);
            backtrack(list, tempList, s.substring(i, s.length()));
            tempList.remove(tempList.size() - 1);
        }

    }

    private boolean isPalindrome(String s){
        int left = 0;
        int right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}