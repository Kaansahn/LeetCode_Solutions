public class Solution {
    public IList<IList<int>> CombinationSum(int[] candidates, int target) {
        IList<IList<int>> res = new List<IList<int>>();
        Backtrack(res, new List<int>(), candidates, target, 0);
        return res;
    }

    public void Backtrack(IList<IList<int>> res, IList<int> temp, int[] candidates, int remain, int index)
    {
        if(remain < 0) return;
        if(remain == 0)
        {
            res.Add(new List<int>(temp));
        }
        else
        {
            for(int i = index; i < candidates.Length; i++)
            {
                temp.Add(candidates[i]);
                Backtrack(res, temp, candidates, remain - candidates[i], i);
                temp.RemoveAt(temp.Count - 1);
            }
        }
    }
}