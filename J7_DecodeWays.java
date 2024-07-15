public class J7_DecodeWays {
    public int decodeways(String s){
        if(s==null || s.length()==0){
            return 0;
        }
        int n=s.length();
        int [] dp=new int[n+1];
        dp[0]=1;
        dp[1]=s.charAt(0)!='0' ? 1:0;
        for(int i=2; i<=n; i++){
            int oneDigit=Integer.parseInt(s.substring(i-1,i));
            int twoDigit=Integer.parseInt(s.substring(i-2,i));

            if(oneDigit >=1 && oneDigit <=9){
                dp[i]+=dp[i-1];
            }
            if(twoDigit >=10 && twoDigit <=26){
                dp[i]+=dp[i-2];
            }
        }
        return  dp[n];
    }
    public static void main(String[] args) {
        J7_DecodeWays sol=new J7_DecodeWays();
        String s="12";
        System.out.println(sol.decodeways(s));
    }
}
