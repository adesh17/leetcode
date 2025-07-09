class Solution {

    public boolean isOpening(char ch)
    {
        return ch=='(' || ch=='{' || ch=='[';
    }

    public boolean isMatch(char o,char c)
    {
        return o=='(' && c==')' || o=='{' && c=='}' || o=='[' && c==']';
    }

    public boolean isValid(String s) 
    {
        Stack<Character> s1=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char b=s.charAt(i);

            if(isOpening(b))
            {
                s1.push(b);
            }
            else
            {
                if(s1.isEmpty())
                {
                    return false;
                }
                if(!isMatch(s1.peek(),b))
                {
                    return false;
                }
                else
                {
                    s1.pop();
                }
            }
        }
        return s1.isEmpty();
    }
}