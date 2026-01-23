/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        while (headA != null) {
            stack1.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            stack2.add(headB);
            headB = headB.next;
        }

        ListNode last_intersection = null;
        while (!stack1.isEmpty() && !stack2.isEmpty() && stack1.peek() == stack2.peek()) {
            last_intersection = stack1.pop();
            stack2.pop();
        }
        return last_intersection;
    }
}