class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int size = len1 + len2;
        int[] merged = new int[size];
        int index = 0;

        while(len1 > 0 || len2 > 0){
            if(len1 > 0){
                merged[index] = nums1[len1-1];
                len1--;
                index++;
            }
            if(len2 > 0){
                merged[index] = nums2[len2-1];
                len2--;
                index++;
            }
        }

        Arrays.sort(merged);
        double ans = 0;
        if(merged.length % 2 == 0){
            ans = (double) (merged[size / 2] + merged[(size / 2) - 1]) / 2 ; 
        }else{
            ans = (double) merged[size / 2];
        }
        return ans;
    }
}