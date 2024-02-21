class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return new ArrayList<>();
        List<String> list = new ArrayList<>();
        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(phone_map, "", digits, list);
        return list;
    }

    private void backtrack(String[] phone_map, String combination, String next_digits, List<String> list){
        if(next_digits.isEmpty()){
            list.add(combination);
        }else{
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for(char letter : letters.toCharArray()){
                backtrack(phone_map, combination + letter, next_digits.substring(1), list);
            }
        }
    }
}