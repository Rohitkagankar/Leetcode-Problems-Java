public class A121_BestTimetoBuy {
    public int maxProfit(int [] prices){
        if(prices == null || prices.length==0) return  0;
        int minPrice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price : prices){
            if( price < minPrice){
                minPrice=price;
            }else if(price-minPrice > maxprofit){
                maxprofit=price-minPrice;
            }
        }
        return  maxprofit;

    }
    public static void main(String[] args) {
        A121_BestTimetoBuy sol = new A121_BestTimetoBuy();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices)); // Output: 5
    }
}
