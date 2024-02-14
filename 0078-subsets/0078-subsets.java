class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, 0);
        return res;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp_list, int[] nums, int start){
        list.add(new ArrayList<>(temp_list));
        for(int i = start; i < nums.length; i++){
            temp_list.add(nums[i]);
            backtrack(list, temp_list, nums, i + 1);
            temp_list.remove(temp_list.size()-1);
        }
        
    }
}