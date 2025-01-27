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
class Solution {
    public int[] nextLargerNodes(ListNode head)
    {
        int size=0;
        ListNode current=head;
        while(current != null)
        {
            size++;
            current=current.next;
        }

        int ans[]=new int[size];

        current=head;
        ListNode temp;
        int i=0;

        while(current!=null)
        {
            temp=current.next;
            while(temp!=null)
            {
                if(temp.val>current.val)
                {
                    ans[i]=temp.val;
                    i++;
                    break;
                }
                else
                {
                    temp=temp.next;
                }
            }
            if(temp==null)
            {
                ans[i]=0;
                i++;
            }
            current=current.next;
        }
        return ans;
    }    
    
}