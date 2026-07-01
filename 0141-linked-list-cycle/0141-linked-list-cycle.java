/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode hard=head;
        while(hard!=null && hard.next != null){
            slow=slow.next;
            hard=hard.next.next;
            if(slow==hard){
                return true;
            }
        }
        return false;
    }
}