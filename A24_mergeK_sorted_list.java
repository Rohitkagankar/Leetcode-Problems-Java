import java.util.PriorityQueue;

public class A24_mergeK_sorted_list {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){val=x;}
        
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        
        // Create a priority queue (min-heap) to keep the smallest elements at the top
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        
        // Add the first node of each list to the priority queue
        for (ListNode list : lists) {
            if (list != null) {
                pq.offer(list);
            }
        }
        
        // Dummy node to help with the merging process
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Process the priority queue
        while (!pq.isEmpty()) {
            // Extract the smallest node
            ListNode smallest = pq.poll();
            current.next = smallest;
            current = current.next;
            
            // If there is more elements in the list, add the next node to the priority queue
            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }
        
        return dummy.next;
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode [] lists=new ListNode[3];

        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);
        
        // List 2: 1 -> 3 -> 4
        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);
        
        // List 3: 2 -> 6
        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        A24_mergeK_sorted_list sol=new A24_mergeK_sorted_list();
        ListNode merged=sol.mergeKLists(lists);

        printList(merged);
        
    }
}
