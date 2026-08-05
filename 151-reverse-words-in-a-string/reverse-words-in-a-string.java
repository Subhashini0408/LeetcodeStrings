class Solution {
    public String reverseWords(String s) {

           StringBuilder sb = new StringBuilder();
           ArrayList<String> list = new ArrayList<>();
           StringBuilder result = new StringBuilder();

           for(int i = 0 ; i < s.length() ; i++)
           {
              char ch = s.charAt(i);
              if(ch != ' ')
              {
                sb.append(ch);
              }
              else
              {
                if(sb.length() > 0)
                {
                    list.add(sb.toString());
                    sb = new StringBuilder();
                }
              }
           }

           if(sb.length() > 0)
           {
              list.add(sb.toString());
           }

           for(int i = list.size() - 1 ; i >= 0 ; i--)
           {
              result.append(list.get(i));
              if(i != 0)
              {
                result.append(" ");
              }
           }

           return result.toString();
        }
    }