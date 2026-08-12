class Solution {
    public String largestOddNumber(String num) {

     //As the num does not contains any leading zeros , so we just return it directly
     for(int i = num.length() - 1 ; i >= 0 ; i--)
     {
        char ch = num.charAt(i);
        int n = ch - '0';
        if(n % 2 == 1)
        {
            return num.substring(0 , i + 1);
        }
     }
      return "";
    }
}