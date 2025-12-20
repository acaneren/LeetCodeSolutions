class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode q = head;
        ListNode p = head;

        for(int i=1; i <= n; i++){
            p = p.next;
        }
        if (p == null) return head.next;

        while(p.next != null){
            q = q.next;
            p = p.next;
        }

        q.next = q.next.next;
        return head;
    }
}