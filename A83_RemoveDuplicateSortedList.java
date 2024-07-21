public class A83_RemoveDuplicateSortedList {
    public static class ListNode {
        ListNode next;
        int val;
        ListNode(){};
        ListNode(int val){this.val=val;}
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public ListNode removeDuplicate(ListNode head){
        ListNode curr=head;
        while(curr != null && curr.next !=null){
            if(curr.val == curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return head;
    }
    public static  void printsol(ListNode result){
        while (result != null) {
            System.out.print(result.val + " ");
            result=result.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        A83_RemoveDuplicateSortedList sol=new A83_RemoveDuplicateSortedList();
        ListNode h1=new ListNode(1);
        h1.next=new ListNode(2);
        h1.next.next=new ListNode(2);
        h1.next.next.next=new ListNode(3);
        ListNode result=sol.removeDuplicate(h1);

        printsol(result);
    }
}
