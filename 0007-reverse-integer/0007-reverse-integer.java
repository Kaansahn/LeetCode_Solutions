class Solution {
    public int reverse(int x) {
        Long result = 0L;

        while(x != 0){
            result = (result * 10) + (x % 10);
            x /= 10;
        }

        if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
            result = 0L;
        }

        return result.intValue();
    }
}