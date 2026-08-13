class Solution {
    public boolean rotateString(String s, String goal) {
        
       if(s.equals(goal))
       {
          return true;
       }
       char[] arr1 = s.toCharArray();
       char first = arr1[0];
       char last = arr1[arr1.length - 1];
       char[] arr2 = goal.toCharArray();

       Arrays.sort(arr1);
       Arrays.sort(arr2);

       if(Arrays.equals(arr1 , arr2))
       {
           for(int i = 0 ; i < goal.length() - 1 ; i++)
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