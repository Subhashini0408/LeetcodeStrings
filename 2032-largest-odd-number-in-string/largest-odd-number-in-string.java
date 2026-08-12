class Solution {
    public String largestOddNumber(String num) {

       int oddind = -1;
       for(int i = num.length() - 1 ; i >= 0 ; i--)
       {
          if(Character.getNumericValue(num.charAt(i)) % 2 == 1)
          {
            oddind = i;
            break;
          }
       }

       if(oddind == -1)
       {
          return "";
       }
       //remove the leading zeros 
       int j = 0;
       while(j < oddind && num.charAt(j) == '0')
       {
         j++;
       }

       return num.substring(j , oddind + 1);
    }
}