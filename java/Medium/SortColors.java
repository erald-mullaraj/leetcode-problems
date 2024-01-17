package Medium;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 1, 1, 0, 0};
        sortColors(nums);
        System.out.println(Arrays.toString((nums)));
    }

    public static void sortColors(int[] nums) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (mid <= right) {
            if (nums[mid] == 1) {
                mid++;
            } 
            else if (nums[mid] == 0) {
                int t = nums[mid];
                nums[mid++] = nums[left];
                nums[left++] = t;
            } else if (nums[mid] == 2) {
                int t = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = t;
            }
        }
    }
}
