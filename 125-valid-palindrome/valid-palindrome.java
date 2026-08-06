class Solution {
    public boolean isPalindrome(String s) {

         s = s.toLowerCase();
         char[] arr = s.toCharArray();

         int left = 0;
         int right = arr.length - 1;

         while(left < right)
         {
            while(left < right && !Character.isLetterOrDigit(arr[left]))
            {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(arr[right]))
            {
                right--;
            }

            if(arr[left] != arr[right])
            {
                return false;
            }

            left++;
            right--;
         }

         return true;
    }
}