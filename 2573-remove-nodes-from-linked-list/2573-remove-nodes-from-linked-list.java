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
    public ListNode removeNodes(ListNode head) 
    {
        ListNode current,previous;
        current=head.next;
        previous=head;
        while(current != null)
        {
            ListNode nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        head.next=null;
        head=previous;

        int max_so_far=Integer.MIN_VALUE;

        ListNode temp=head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode previous1=dummy;

        while(temp != null)
        {
            if(temp.val >= max_so_far)
            {
                max_so_far=temp.val;
                previous1=temp;
            }
            else
            {
                previous1.next=temp.next;
            }
            temp=temp.next;
        }
        current=head.next;
        previous=head;
        while(current != null)
        {
            ListNode nextNode=current.next;
            current.next=previous;
            previous=current;
            current=nextNode;
        }
        head.next=null;
        head=previous;

        return head;
    }
}