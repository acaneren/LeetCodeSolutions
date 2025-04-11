/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    
    struct ListNode* previous_node= NULL;
    struct ListNode* current_node = head;
    struct ListNode* next_node = NULL;

    while(current_node){

        next_node = current_node->next;
        
        current_node->next = previous_node;
        previous_node = current_node;
        current_node = next_node;
    }
    return previous_node;
}