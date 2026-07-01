class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode nextnode;

        while(current != null)
        {
                
                nextnode = current.next;
                current.next = previous;
                previous = current;
                current = nextnode;

        }
        head = previous;
        return head;
    }
}