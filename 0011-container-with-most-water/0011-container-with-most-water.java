class Solution {
    public int maxArea(int[] height) {
        int len = height.length;
        int left = 0;
        int right = len-1;
        int max = 0;

        while(left < right){
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            max = Math.max(max, area);

            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else{
                right--;
                left++;
            }
        }
        return max;
    }
}