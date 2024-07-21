public class A92_ReverseLL2 {
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode reverselist(ListNode head, int m, int n){
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;

        for(int i=0; i<m; i++){
            prev=prev.next;
        }
        ListNode start=prev.next;
        ListNode then=start.next;

        for(int i=0; i<n-m; i++){
            start.next=then.next;
            then.next=prev.next;
            prev.next=then;
            then=start.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        A92_ReverseLL2 sol=new A92_ReverseLL2();
        ListNode l1=new ListNode(0);
        l1.next=new ListNode(1);
        l1.next.next=new ListNode(2);
        l1.next.next.next=new ListNode(3);
        l1.next.next.next.next=new ListNode(4);
        l1.next.next.next.next.next=new ListNode(5);

        ListNode head=sol.reverselist(l1,2,4);
        ListNode curr=head;
        while(curr !=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}
