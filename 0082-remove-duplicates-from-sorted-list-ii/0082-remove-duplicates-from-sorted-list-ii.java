class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null) return null;

        Map<Integer, Integer> map = new HashMap<>();

        ListNode p = head;

        while(p != null){
            if(map.containsKey(p.val)){
                map.put(p.val, map.get(p.val)+1);
            }
            else{
                map.put(p.val, 1);
            }
            p = p.next;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        p = head;
        ListNode q = dummy;
        
        while(p != null){
            if(map.get(p.val) > 1){
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