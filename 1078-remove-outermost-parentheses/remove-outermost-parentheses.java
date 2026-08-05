class Solution { 
    public String removeOuterParentheses(String s) { 

       StringBuilder sb = new StringBuilder();
       char[] stack = new char[s.length()];
       int top = -1;

       for(char ch : s.toCharArray())
       {
          if(ch == '(')
          {
            if(top > -1)
            {
                sb.append(ch);
            }
            stack[++top] = ch;
          }
          else
          {
            top--;
            if(top > -1)
            {
               sb.append(ch);
            }
          }
       }
       return sb.toString();
    } 
}
