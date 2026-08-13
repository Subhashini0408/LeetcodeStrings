class Solution {
    public boolean rotateString(String s, String goal) {
        
        if(s.equals(goal))
        {
            return true;
        }
        char[] arr1 = s.toCharArray();
        char[] arr2 = goal.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1 , arr2))
        {
            char[] arr = s.toCharArray();
            char first = arr[0];
            char last = arr[arr.length - 1];
            for(int i = 0 ; i < goal.length() ; i++)
            {
               if(goal.charAt(i) == last && goal.charAt(i + 1) == first)
               {
                  return true;
               }
            }
        }

        return false;
    }
}