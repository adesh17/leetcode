class Solution {
    public int firstUniqChar(String s) 
    {
        int freq[]=new int[26];
        Queue<Character> q=new LinkedList<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            freq[ch-'a']++;
            q.add(ch);
        } 
        while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) 
        {
            q.remove();
        }

        if(q.isEmpty())
        {
            return -1;
        }

        int f=0;
        for(int i=0;i<s.length();i++)
        {
            if(q.peek()==s.charAt(i))            
            {
                f=i;
                break;
            }
        }

        return f;

    }
}