/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *middleNode(struct ListNode *head) {

    int len = 0;
    struct ListNode *p = head;
    while (p) {
        len++;
        p = p->next;
    }

    for (int i = 0; i < len / 2; i++) {
        head = head->next;
    }
    return head;
}
