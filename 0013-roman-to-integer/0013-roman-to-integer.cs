public class Solution {
    public int RomanToInt(string s) {
        int result = 0;
        int exNum = 0;

        foreach(char c in s)
        {
            switch(c)
            {
                case 'I':
                    result += 1;
                    exNum = 1;
                    break;
                case 'V':
                    result += 5;
                    if(exNum == 1)
                        result -= 2;
                    exNum = 5;
                    break;
                case 'X':
                    result += 10;
                    if(exNum == 1)
                        result -= 2;
                    exNum = 10;
                    break;
                case 'L':
                    result += 50;
                    if(exNum == 10)
                        result -= 20;
                    exNum = 50;
                    break;
                case 'C':
                    result += 100;
                    if(exNum == 10)
                        result -= 20;
                    exNum = 100;
                    break;
                case 'D':
                    result += 500;
                    if(exNum == 100)
                        result -= 200;
                    exNum = 500;
                    break;
                case 'M':
                    result += 1000;
                    if(exNum == 100)
                        result -= 200;
                    exNum = 1000;
                    break;
                default:
                    Console.WriteLine("Invalid roman number!");
                    break;
            }
        }
        return result;
    }
}