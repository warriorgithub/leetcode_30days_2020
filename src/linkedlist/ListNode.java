package linkedlist;

public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
class MiddleElement {
    public ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null){
            slow = slow.next;
        }
        return slow;
    }
}
