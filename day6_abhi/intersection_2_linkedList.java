package day6_abhi;


class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != tempB){
            if(tempA == null)
            tempA = headA;
            else
tempA = tempA.next;
            if(tempB == null)
            tempB = headB;
            else
              tempB = tempB.next;
            
          
        }

        return tempA;
    }
}