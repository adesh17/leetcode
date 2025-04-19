/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 import java.util.Vector;
class Solution {
    public int pairSum(ListNode head) 
    {
        
        Vector<Integer> v = new Vector<>();
        ListNode temp=head;

        while(temp!=null)
        {
            v.add(temp.val);
            temp=temp.next;
        }

        int i=0,j=v.size()-1,maxsum=0,sum=0;

        while(i<j)
        {
            sum=v.get(i)+v.get(j);
            if(sum>maxsum)
            {
                maxsum=sum;
            }
            i++;
            j--;
        }
        return maxsum;

    }
}