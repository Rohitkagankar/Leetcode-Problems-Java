;
public class A24_swap_pair {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        // Initialize the current node to the dummy node
        ListNode current = dummy;
        
        // Traverse the list and swap pairs
        while (current.next != null && current.next.next != null) {
            // Nodes to be swapped
            ListNode first = current.next;
            ListNode second = current.next.next;
            
            // Perform the swap
            first.next = second.next;
            second.next = first;
            current.next = second;
            
            // Move the current pointer to the next pair
            current = first;
        }
        
        // Return the new head of the list
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create sample list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        
        // Swap nodes in pairs
        A24_swap_pair solution = new A24_swap_pair();
        ListNode swappedHead = solution.swapPairs(head);
        
        // Print swapped list
        printList(swappedHead);
    }
    
    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}