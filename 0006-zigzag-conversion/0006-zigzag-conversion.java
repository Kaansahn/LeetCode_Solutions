class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;

        int length = s.length();
        StringBuilder sb = new StringBuilder();
        int diff = 2 * (numRows - 1);
        int diagonalDiff = diff;
        int index;

        for(int i = 0; i < numRows; i++){
            index = i;

            while(index < length){
                sb.append(s.charAt(index));
                if(i != 0 && i != numRows - 1){
                    diagonalDiff = diff - 2 * i;
                    if((index + diagonalDiff) < length) sb.append(s.charAt(index + diagonalDiff));
                }
                index += diff;
            }
        }
        return sb.toString();
    }
}