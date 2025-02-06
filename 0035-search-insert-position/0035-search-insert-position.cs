public class Solution {
    public int SearchInsert(int[] arr, int target) {
        int low = 0, high = arr.Length - 1;

            while(low <= high)
            {
                int mid = low + (high - low) / 2;

                if(arr[mid] == target) return mid;
                else if(arr[mid] > target) high = mid - 1;
                else low = mid + 1;
            }

            return low;
    }
}