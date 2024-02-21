package day7_abhi;


class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //using the len of the linked list
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(k == 0 || head == null)
        return head;

        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp=temp.next;
        }

        k = k % len;

        if(k == 0)
        return head;

        int travel = len - k;
        temp = head;
        while(--travel > 0){
            temp = temp.next;
        }

        ListNode res = temp.next;
        temp.next = null;
        ListNode tra = res;
        while(res.next != null){
            res = res.next;
        }

        res.next = head;
        return tra;

    }
}