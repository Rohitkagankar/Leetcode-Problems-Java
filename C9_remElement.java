public class C9_remElement {
    public static int remElement(int [] nums,int val){
        int index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[index++]=nums[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int [] nums={1,2,2,3,4,2,5};
        System.out.println(remElement(nums,2));
    }
}
