class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }
    
    private void backtrack(List<List<Integer>> list, List<Integer> temp_list, int[] nums, int remain, int start){
        if(remain < 0) return;
        else if(remain == 0) list.add(new ArrayList<>(temp_list));
        else {
            for(int i = start; i < nums.length; i++){
                temp_list.add(nums[i]);
                backtrack(list, temp_list, nums, remain - nums[i], i);
                temp_list.remove(temp_list.size()-1);
            }
        }
    }
    
}