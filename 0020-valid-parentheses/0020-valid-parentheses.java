class Solution {
    
    boolean isOpening(char c)
    {
        return c=='(' || c=='{' || c=='[';
    }

    boolean match(char o,char c)
    {
        return o=='(' && c==')' || o=='[' && c==']' || o=='{' && c=='}';
    }

    public boolean isValid(String s) 
    {
        Stack<Character> mystack=new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(isOpening(curr))
            {
                mystack.push(curr);
            }
            else
            {
                if(mystack.isEmpty())
                {
                    return false;
                }

                if(!match(mystack.peek(),curr))
                {
                    return false;
                }
                else
                {
                    mystack.pop();
                }
            }
        }    
        return mystack.isEmpty();
    }
}