public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        StringBuilder sb = new();
        string shortest = strs.OrderBy(s => s.Length).First();
        int i=0;

        foreach(char c in shortest)
        {
            if(strs.Any(s => s[i] != c)) break;
            i++;
            sb.Append(c);
        }
        return sb.ToString();
    }
}