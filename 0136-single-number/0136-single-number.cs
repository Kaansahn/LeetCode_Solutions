public class Solution {
    public int SingleNumber(int[] nums) {
        int i = 1;
        Array.Sort(nums);

        while(i < nums.Length)
        {
            if(nums[i] != nums[i-1]) return nums[i-1];
            i = i + 2;
        }

        return nums[nums.Length - 1];
    }
}