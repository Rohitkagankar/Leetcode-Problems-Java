public class E6_trappingRainWater {
    public static void trappingWater(int [] height){
        int n=height.length;
        //find leftmost -----
        int [] leftmost=new int[n];
        leftmost[0]=height[0];
        int i=1;
        while(i<n){
            leftmost[i]=Math.max(height[i], leftmost[i-1]);
            i++;
        }

        //find rightmost ------
        int [] rightmost =new int[n];
        rightmost[n-1]=height[n-1];
        int r=n-2;
        while (r>=0) {
            rightmost[r]=Math.max(height[r], leftmost[r+1]);
            r--;
        }

        //find trapped water -----
        int trWater=0;
        int s=0;
        while (s<n) {
            int water=Math.min(leftmost[s], rightmost[s]);
            trWater+=water-height[s];
            s++;
            
        }
        System.out.println(trWater);
    }
    public static void main(String[] args) {
        int [] height={4,2,0,3,2,5};
        trappingWater(height);
    }
}
