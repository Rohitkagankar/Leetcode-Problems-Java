public class H3_PlusOne {
    public int [] plusOne(int [] num){
        int n=num.length;

        for(int i=n-1; i>=0; i--){
            int c=num[i];
            if(c<9){
                num[i]++;
                return num;
            }
            num[i]=0;
        }

        int [] newNum=new int[n+1];
        newNum[0]=1;
        return newNum;
    }
    public static void main(String[] args) {
        H3_PlusOne sol=new H3_PlusOne();
        int [] num={1,2,3};
        int []result=sol.plusOne(num);
        for(int val : result){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
