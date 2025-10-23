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
    public boolean isPalindrome(ListNode head) {
        int len = 0;
        ListNode p = head;
        while(p != null){
            len++;
            p = p.next;
        }

        Stack<Integer> stack1 = new Stack<>();
        p = head;
        for(int i=0 ; i < len/2; i++){
            stack1.add(p.val);
            p = p.next;
        }

        if(len % 2 == 1){
            p = p.next;
        }

        while(p != null){
            if(stack1.pop() != p.val){
                return false;
            }
            p = p.next;
        }
        return true;
    }
}