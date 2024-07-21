public class A61_RotateList {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode rotateList(ListNode head,int k){
        if(head==null || head.next==null || k==0) return head;

        ListNode curr=head;
        int len=1;
        while (curr.next != null) {
            curr=curr.next;
            len++;
        }

        curr.next=head;

        k=k%len;
        int stepofhead=len-k;
        ListNode newtail=head;
        for(int i=1; i<stepofhead; i++){
            newtail=newtail.next;
        }
        ListNode newHead=newtail.next;
        newtail.next=null;

        return newHead;
    }
    public static void main(String[] args) {
        A61_RotateList sol=new A61_RotateList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k=2;
        ListNode newHead=sol.rotateList(head, k);

        ListNode curr=newHead;
        while (curr !=null) {
            System.out.print(curr.val+"=>");
            curr=curr.next;
        }
        System.out.println("null");
    }
}
