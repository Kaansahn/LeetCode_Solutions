public class Solution {
    public int[] TwoSum(int[] arr, int target) {
        for(int i = 0; i < arr.Length-1; i++)
            {
                for(int j = i+1; j < arr.Length; j++)
                {
                    if(arr[i] + arr[j] == target) return new int[] {i, j};
                    else if(arr[j] + arr[j - 1] == target) return new int[] {j, j-1};
                }
            }
            return null;
    }
}