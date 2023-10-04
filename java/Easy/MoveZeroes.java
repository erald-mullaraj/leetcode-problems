package Easy;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int s = 0;
        int n = 0;
        while(n < nums.length){
            if(nums[n] != 0) {
                int tmp = nums[s];
                nums[s++] = nums[n];
                nums[n] = tmp;
            }
            n++;
        }
    }
}
