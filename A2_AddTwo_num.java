public class A2_AddTwo_num {
    public static class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; } 
        }

    public static void addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result =new ListNode(0);
        ListNode ptr = result;

        int carry=0;

        while(l1 != null || l2 != null){
            int sum= 0+ carry;
            if(l1 != null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!= null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            ptr.next= new ListNode(sum);
            ptr=ptr.next;
        }
        if(carry==1){
            ptr.next= new ListNode(1);
        }
        printListNode(result.next);
        
    }
    public static void printListNode(ListNode A){
        ListNode temp=A;
        while (temp !=null) {
            System.out.print(temp.val+"=>");
            temp=temp.next;  
        }
        System.out.print("null");
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2= new ListNode(5);
        l2.next= new ListNode(6);
        l2.next.next=new ListNode(4);
        
        addTwoNumbers(l1,l2);

    }
}
