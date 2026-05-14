import java.util.*;

public class rec1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        List<List<Integer>> result = new ArrayList<>();
        solve(0, nums, new ArrayList<>(), result);

        // print result
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }

    static void solve(int index, int[] nums,
                      List<Integer> current,
                      List<List<Integer>> result) {

        // BASE CASE
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // ===== TAKE =====
        current.add(nums[index]);
        solve(index + 1, nums, current, result);

        // ===== UNDO =====
        current.remove(current.size() - 1);

        // ===== DON'T TAKE =====
        solve(index + 1, nums, current, result);
    }
}
/*class Solution {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int index, int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // BASE CASE
        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // CHOICE 1: TAKE nums[index]
        current.add(nums[index]);
        backtrack(index + 1, nums, current, result);

        // UNDO
        current.remove(current.size() - 1);

        // CHOICE 2: DON'T TAKE nums[index]
        backtrack(index + 1, nums, current, result);
    }
}
*/
