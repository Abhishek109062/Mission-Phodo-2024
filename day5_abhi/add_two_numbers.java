package day5_abhi;

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
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        
        int carry = 0;
        while(l1 != null || l2 != null){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            
            ListNode temp = new ListNode((x + y + carry) % 10);
            dummy.next = temp;
            dummy = dummy.next;
            
            carry = (x + y + carry) / 10;
            if(l1 != null)
                l1 = l1.next;
            
            if(l2 != null)
                l2 = l2.next;
        }
                                         
        if(carry > 0){
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
        }                    
        return result.next;
    }
}