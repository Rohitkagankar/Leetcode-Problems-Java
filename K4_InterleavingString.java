public class K4_InterleavingString {
    public boolean isInterleave(String s1, String s2, String s3) {
        int m=s1.length();
        int n=s2.length();

        if(m+n!=s3.length()){
            return false;
        }
        boolean [][] dp=new boolean[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                if(i==0 && j==0){
                    dp[i][j]=true;
                }else if(i==0){
                    dp[i][j]=dp[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1);
                }else if(j==0){
                    dp[i][j]=dp[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1);
                }else{
                    dp[i][j]=(dp[i][j-1] && s2.charAt(j-1)==s3.charAt(i+j-1)) ||
                    (dp[i-1][j] && s1.charAt(i-1)==s3.charAt(i+j-1));
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        K4_InterleavingString sol= new K4_InterleavingString();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        
        boolean result = sol.isInterleave(s1, s2, s3);
        System.out.println("Is s3 an interleaving of s1 and s2? " + result);
    }
}
