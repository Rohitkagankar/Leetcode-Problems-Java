public class I9_RemoveDuplicatesFromList {
    public static class ListNode{
        ListNode next;
        int val;
        ListNode(){};
        ListNode(int val){
            this.val=val;
            this.next=null;
        };
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }

    }
    public static ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                prev.next = head.next; // Skip all duplicates
            } else {
                prev = prev.next; // Move prev pointer
            }
            head = head.next; // Move head pointer
        }
        
        return dummy.next;
    }
    public static void printresult(ListNode result){
        while (result != null) {
            System.out.print(result.val +" ");
            result=result.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        I9_RemoveDuplicatesFromList sol=new I9_RemoveDuplicatesFromList();
        ListNode head = createLinkedList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode result = sol.deleteDuplicates(head);
        
        printresult(result);
    }
}
