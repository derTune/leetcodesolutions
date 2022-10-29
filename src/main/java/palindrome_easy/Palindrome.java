package palindrome_easy;

/**
 * @author AZZhalilov
 * @since 29.10.2022
 */
public class Palindrome {
    public static boolean isPalindrome(int x) {
        String number = "" + x;
        char[] nums = number.toCharArray();
        int middle, reverseMiddle;
        if (nums.length % 2 != 0) {
            middle = nums.length / 2;
            reverseMiddle = middle;
        } else {
            reverseMiddle = nums.length / 2;
            middle = reverseMiddle - 1;
        }
        int straight = 0;
        int reverse = nums.length - 1;
        for (; straight <= middle && reverse >= reverseMiddle; straight++, reverse--) {
            if (nums[straight] != nums[reverse]) return false;
        }
        return true;
    }
}

// [1, 2, 1]    [2, 3, 3, 2]
