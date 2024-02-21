package day7_abhi;

class Node {
    int val;
    Node next;
    Node random;
    Node(int value) {
        val = value;
        next = null;
        random = null;
    }
}


class Solution {
    public Node copyRandomList(Node head) {
      if (head == null) return null;
  
      var len = 0;
      for (var ptr = head; ptr != null; ptr = ptr.next) len++;
  
      var newList = new Node[len];
      var ptr = head;
  
      for (var i=0; i<len; i++) {
        newList[i] = new Node(ptr.val);
        ptr.val = i;
        ptr = ptr.next;
      }
      ptr = head;
  
      for (var i=0; i<len; i++) {
        if (i < len-1)
          newList[i].next = newList[i+1];
          
        newList[i].random = ptr.random == null ? null : newList[ptr.random.val];
        ptr = ptr.next;
      }
      return newList[0];
    }
  }