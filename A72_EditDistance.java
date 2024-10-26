public class A72_EditDistance {
    public int editDistance(String word1,String word2){
        int m=word1.length();
        int n=word2.length();
        
        int [][] dp=new int[m+1][n+1];
        
        for(int i=0; i<=m; i++){
            dp[i][0]=i;
        }
        for(int j=0; j<=n; j++){
            dp[0][j]=j;
        }
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.min(dp[i-1][j-1],Math.min(dp[i-1][j], dp[i][j-1]))+1;
                }
            }
        }
        return dp[m][n];

    }
    public static void main(String[] args) {
        A72_EditDistance sol=new A72_EditDistance();
        String s1="home";
        String s2="pom";
        System.out.println(sol.editDistance(s1,s2));
        String p1="lete";
        String p2="ete";
        System.out.println(sol.editDistance(p1,p2));
    }
}
