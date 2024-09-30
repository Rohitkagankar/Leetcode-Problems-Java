public class A605_CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // Count of flowers that can be placed
        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current position is empty and adjacent positions are also empty or out of bounds
            if (flowerbed[i] == 0 && 
               (i == 0 || flowerbed[i - 1] == 0) && 
               (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                // Place a flower here
                flowerbed[i] = 1;
                count++;
            }
            // Check if we've placed enough flowers
            if (count >= n) {
                return true;
            }
        }
        // If we couldn't place enough flowers
        return count >= n;
    }
    public static void main(String[] args) {
        A605_CanPlaceFlowers solution = new A605_CanPlaceFlowers();

        // Example flowerbeds and number of flowers to place
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can place " + n1 + " flowers: " + solution.canPlaceFlowers(flowerbed1, n1)); // Output: true

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println("Can place " + n1 + " flowers: " + solution.canPlaceFlowers(flowerbed, n)); // Output: false

    }
}

