Q Link : https://leetcode.com/problems/middle-of-the-linked-list/

class Solution {
    public ListNode middleNode(ListNode head) {
        // Check if the list is empty or has only one element, in which case the middle is the head itself
        if (head == null || head.next == null) {
            return head;
        }

        // Initialize two pointers: slow and fast, both initially pointing to the head
        ListNode slow = head;
        ListNode fast = head;

        // Traverse the list with two pointers:
        // - Slow pointer moves one step at a time
        // - Fast pointer moves two steps at a time
        // This way, when the fast pointer reaches the end, the slow pointer will be at the middle
        while (fast != null && fast.next != null) {
            fast = fast.next.next; // Move fast pointer by two steps
            slow = slow.next;     // Move slow pointer by one step
        }

        // Return the slow pointer, which is now pointing to the middle of the list
        return slow;
    }
}
