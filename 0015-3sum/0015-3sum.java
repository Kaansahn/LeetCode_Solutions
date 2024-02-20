class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int target = 0;

        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < len; i++){
            int j = i + 1;
            int k = len - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) {
                    set.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                }else if(sum < target) j++;
                else k--;
            }
        }
        list.addAll(set);
        return list;
    }
}