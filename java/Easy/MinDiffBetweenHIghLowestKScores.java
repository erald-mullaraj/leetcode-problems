package Easy;

import java.util.Arrays;

public class MinDiffBetweenHIghLowestKScores {
    public static void main(String[] args) {
        int[] nums = {9, 4, 1, 7};
        System.out.println(minimumDifference(nums, 2));
    }

    public static int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-k+1; i++) {
            min = Math.min((Math.abs(nums[i] - nums[i+k-1])), min);
        }

        return min;
    }
}
