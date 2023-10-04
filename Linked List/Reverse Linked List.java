Q Link : https://leetcode.com/problems/reverse-linked-list/description/

class Solution {
    public ListNode reverseList(ListNode head) {
        // Initialize two pointers: prev and curr
        // prev will initially be null because there's no previous node before the head
        ListNode curr = head;
        ListNode prev = null;

        // Traverse the linked list until the current node is not null
        while(curr != null) {
            // Store the next node in a temporary variable 'next'
            ListNode next = curr.next;
            
            // Reverse the direction of the current node's pointer to point to the previous node
            curr.next = prev;
            
            // Move prev and curr pointers one step forward in the linked list
            prev = curr;
            curr = next;
        }
        
        // At the end of the loop, 'prev' will be pointing to the new head of the reversed list
        // Return 'prev' as the new head of the reversed linked list
        return prev;
    }
}
