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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode l3=new ListNode(0);
        ListNode l3_iter=l3;
        ListNode prev=l3_iter;
        int rem=0;
        while(l1!=null||l2!=null)
        {
            int sum = (l1==null?0:l1.val) + (l2==null?0:l2.val)+rem;
            int val=sum%10;
            rem=sum/10;
            l3_iter.val=val;
            l3_iter.next=new ListNode();
            prev=l3_iter;
            l3_iter=l3_iter.next;
            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
        }
        if(rem==0)
        {
prev.next=null;

        }
        else
        {
            l3_iter.val=rem;
        }
        return l3;
    }


    
}
