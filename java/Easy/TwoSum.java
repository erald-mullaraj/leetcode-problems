import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int values[] = new int[]{1,2,3,2,1,3};
        System.out.println(Arrays.toString(twoSum(values,  6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i=0;i<nums.length;i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}