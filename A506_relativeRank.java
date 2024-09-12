import java.util.Arrays;
import java.util.HashMap;

public class A506_relativeRank {
    public String[] findRelativeRanks(int[] scores) {
        
        int[] sortedScores = scores.clone();
        Arrays.sort(sortedScores);
        
     
        HashMap<Integer, String> rankMap = new HashMap<>();
        int n = sortedScores.length;
        
   
        for (int i = 0; i < n; i++) {
            int score = sortedScores[n - 1 - i];
            if (i == 0) {
                rankMap.put(score, "Gold Medal");
            } else if (i == 1) {
                rankMap.put(score, "Silver Medal");
            } else if (i == 2) {
                rankMap.put(score, "Bronze Medal");
            } else {
                rankMap.put(score, String.valueOf(i + 1));
            }
        }

        String[] result = new String[scores.length];
        for (int i = 0; i < scores.length; i++) {
            result[i] = rankMap.get(scores[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        A506_relativeRank solution = new A506_relativeRank();
        int[] scores = {10, 3, 8, 9, 4};
        String[] result = solution.findRelativeRanks(scores);
        System.out.println(Arrays.toString(result));
    }
}
