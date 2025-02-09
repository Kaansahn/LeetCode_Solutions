public class Solution {
    public IList<IList<int>> Subsets(int[] nums) {
        IList<IList<int>> resultList = new List<IList<int>>();
        resultList.Add(new List<int>());

        foreach(int num in nums)
        {
            int size = resultList.Count;
            for(int i = 0; i < size; i++)
            {
                List<int> newSubset = new List<int>(resultList[i]);
                newSubset.Add(num);
                resultList.Add(newSubset);
            }
        }
        return resultList;
    }
}