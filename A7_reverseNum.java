public class A7_reverseNum {
    public static int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=x%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=(rev*10)+digit;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args){
        System.out.println(reverse(123));
    }
}
