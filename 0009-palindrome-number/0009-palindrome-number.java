class Solution {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int number = x;
        int multiplier = 10; 
        while(number > 0){
            sum = (number % 10) + (multiplier * sum);
            number /= 10; 
        }
        if(sum==x){
            return true;
        }
        else
        return false;
    }
}