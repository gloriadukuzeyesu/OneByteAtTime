import java.util.HashMap;
import java.util.Map;


public class TwoSums {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{i, map.get(compliment)};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] sol = twoSum(nums, target);
        for (int x : sol) {
            System.out.print(x + " ");
        }

    }
}
