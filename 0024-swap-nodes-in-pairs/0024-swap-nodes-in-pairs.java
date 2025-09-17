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
    public ListNode swapPairs(ListNode head) 
    {
        if(head==null || head.next==null)
        {
            return head;
        }   

        ListNode current=head.next;
        ListNode nextNode=current.next;
        ListNode previous=head;

        while(current!=null)
        {
            ListNode temp=new ListNode();
            temp.val=current.val;
            current.val=previous.val;
            previous.val=temp.val;

            previous = nextNode;
            if (previous == null) break; 

            current = previous.next;
            if (current == null) break;  

            nextNode=current.next;
        }
        
        return head;
    }
}