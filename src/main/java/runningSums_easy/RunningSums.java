package runningSums_easy;

/**
 * @author AZZhalilov
 * @since 29.10.2022
 */
public class RunningSums {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] + nums[i];
        }
        return result;
    }
}