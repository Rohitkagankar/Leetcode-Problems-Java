import java.util.Arrays;

public class A135_CandyDistribution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        // Left to right pass
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        // Right to left pass
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        // Sum up the candies
        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public static void main(String[] args) {
        A135_CandyDistribution solution = new A135_CandyDistribution();
        int[] ratings = {1, 0, 2};
        int[] rating = {1,2,1,3,1,5};
        System.out.println(solution.candy(ratings)); // Output: 5
        System.out.println(solution.candy(rating));
    }
}
