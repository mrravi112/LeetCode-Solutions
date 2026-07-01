class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val){
            head=head.next;
        }
        ListNode c=head;

        int d=val;
        while(c!=null && c.next!=null){
            if(c.next.val==d){
                c.next=c.next.next;
            }
            else{
                c=c.next;
            }
        }   
        return head;
    }
}