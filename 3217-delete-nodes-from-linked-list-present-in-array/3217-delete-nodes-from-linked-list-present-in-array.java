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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numberSet = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toSet());

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode q = dummy;
        ListNode p = head;

        while (p != null) {
            if (numberSet.contains(p.val)) {
                q.next = p.next;
            }
            else{
                q = p;
            }
            p = p.next;
        }
        return dummy.next;
    }
}