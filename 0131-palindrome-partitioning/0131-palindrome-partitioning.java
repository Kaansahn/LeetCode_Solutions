class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(s, list, new ArrayList<>());
        return list;
    }

    private void backtrack(String s, List<List<String>> list, List<String> tempList){
        if(s == null || s.length() == 0){
            list.add(new ArrayList<>(tempList));
            return;
        }
        for(int i = 1; i <= s.length(); i++){
            String temp = (s.substring(0, i));
            if(!isPalindromic(temp)) continue;
            tempList.add(temp);
            backtrack(s.substring(i, s.length()), list, tempList);
            tempList.remove(tempList.size() - 1);
        }
    }

    private boolean isPalindromic(String s){
        int left = 0, right = s.length() - 1;
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

}