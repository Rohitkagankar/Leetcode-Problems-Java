public class C7_reverseKGroupLL {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val=x;};
    }
    public static ListNode reverseKGroup(ListNode head, int k){
        if(head==null && k==1) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy,nex=dummy, pre=dummy;
        int count=0;

        while (curr.next != null) {
            curr=curr.next;
            count++;
        }
        while (count >= k) {
            curr=pre.next;
            nex=curr.next;

            for(int i=1; i<k; i++){
                curr.next=nex.next;
                nex.next=pre.next;
                pre.next=nex;
                nex=curr.next;
            }
            pre=curr;
            count -=k;
        }
        return dummy.next;
    }
    public static void printlist(ListNode head){
        ListNode temp=head;
        while(temp !=null){
            System.out.print(temp.val+ "=>");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode list=new ListNode(1);
        list.next=new ListNode(2);
        list.next.next=new ListNode(3);
        list.next.next.next=new ListNode(4);
        list.next.next.next.next=new ListNode(5);

        C7_reverseKGroupLL sol=new C7_reverseKGroupLL();
        ListNode result=sol.reverseKGroup(list, 3);
        printlist(result);
    }
}
