public class A141_LinkedListCycle {
    public static  class ListNode{
        int val;
        ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public  boolean iscycle(ListNode head){
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head.next;

        while(slow != fast){
            if(fast==null || fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n2;

        A141_LinkedListCycle sol=new A141_LinkedListCycle();
        boolean result=sol.iscycle(n1);

        if(result){
            System.out.println("Cycle is exist");
        }else{
            System.out.println("cycle does not exist.");
        }
        
    }
}
