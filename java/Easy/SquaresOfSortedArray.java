package Easy;

import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    public static int[] sortedSquares(int[] nums) {

        int l = nums.length;
        int[] r = new int[l];
        int rgt = l - 1;
        int lft = 0;
        int rIdx = l - 1;
        while (lft <= rgt) {
            if (nums[lft] * nums[lft] >= nums[rgt] * nums[rgt]) {
                r[rIdx] = nums[lft] * nums[lft];
                lft++;
            } else {
                r[rIdx] = nums[rgt] * nums[rgt];
                rgt--;
            }
            rIdx--;
        }
        return r;
    }
}
