public class Solution {
    public IList<IList<int>> Permute(int[] nums) {
        IList<IList<int>> result = new List<IList<int>>();
        Backtrack(result, new List<int>(), nums);
        return result;
    }

    public void Backtrack(IList<IList<int>> result, IList<int> temp, int[] nums)
    {
        if(temp.Count == nums.Length)
        {
            result.Add(new List<int>(temp));
            return;
        }
        foreach(int num in nums)
        {
            if(temp.Contains(num)) continue;
            temp.Add(num);
            Backtrack(result, temp, nums);
            temp.RemoveAt(temp.Count - 1);
        }
    }
}