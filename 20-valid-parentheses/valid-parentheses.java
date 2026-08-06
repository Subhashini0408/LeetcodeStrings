class Solution {
    public boolean isValid(String s) {
      
       //optimized approach using custom char Array
       char[] stack = new char[s.length()];
       int top = -1;

       for(char ch : s.toCharArray())
       {
          if(ch == '(' || ch == '[' || ch == '{')
          {
             stack[++top] = ch;
          }
          else
          {
             if(top == -1)
             {
                return false;
             }

             char lastopen = stack[top--];

             if(ch == ')' && lastopen != '(') return false;
             if(ch == '}' && lastopen != '{') return false;
             if(ch == ']' && lastopen != '[') return false;
          }
       }
       return top == -1;
    }
}