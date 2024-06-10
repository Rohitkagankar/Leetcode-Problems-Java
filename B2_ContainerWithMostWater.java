public class B2_ContainerWithMostWater {
    public static int waterMaxArea(int[] height){
        if (height == null || height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = width * currentHeight;
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
    public static void main(String[] args) {
        B2_ContainerWithMostWater sol=new B2_ContainerWithMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum water that can be contained: " + sol.waterMaxArea(height));
    }
}
