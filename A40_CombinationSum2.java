import java.util.*;
public class A40_CombinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(candidates);  // Sort the array to handle duplicates
        backtrack(candidates, target, 0, new ArrayList<>(), results);
        return results;
    }

    private void backtrack(int[] candidates, int target, int start, List<Integer> combination, List<List<Integer>> results) {
        if (target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If the current number is greater than the remaining target, no need to proceed further
            if (candidates[i] > target) break;

            // Include the current number in the combination
            combination.add(candidates[i]);
            // Recursively try the next numbers with the reduced target
            backtrack(candidates, target - candidates[i], i + 1, combination, results);
            // Backtrack: remove the last added number
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        A40_CombinationSum2 solution = new A40_CombinationSum2();
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> results = solution.combinationSum2(candidates, target);
        for (List<Integer> combination : results) {
            System.out.println(combination);
        }
    }
}
