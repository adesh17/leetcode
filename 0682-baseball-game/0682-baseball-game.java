class Solution {
    
    boolean check(String s)
    {
        if(s.equals("+") || s.equals("D") || s.equals("C"))
        return false;
        else
        return true;
    }
    public int calPoints(String[] operations) 
    {
        Stack<Integer> stack=new Stack<Integer>();

        for(int i=0;i<operations.length;i++)
        {
            if(check(operations[i]))
            {
                int score=Integer.parseInt(operations[i]);
                stack.push(score);
            }
            else if(operations[i].equals("C"))
            {
                stack.pop();
            }
            else if(operations[i].equals("D"))
            {
                stack.push(stack.peek()*2);
            }
            else if(operations[i].equals("+"))
            {
                int last=stack.get(stack.size()-1);
                int secondlast=stack.get(stack.size()-2);
                stack.push(last+secondlast);
            }
        } 

        int sum=0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        return sum;
    }
}