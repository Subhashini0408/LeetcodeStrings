class Solution { 
    public String removeOuterParentheses(String s) { 

       int start = 0;
       int count = 0;
       StringBuilder sb = new StringBuilder();
       for(int end = 0 ; end < s.length() ; end++)
       {
          char ch = s.charAt(end);
          if(ch == '(')
          {
            count++;
          }
          else
          {
            count--;
          }
          if(count == 0)
          {
            sb.append(s.substring(start + 1 , end));
            start = end + 1;
          }
       }
       return sb.toString();
    } 
}
