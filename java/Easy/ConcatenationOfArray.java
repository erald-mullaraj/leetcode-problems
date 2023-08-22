import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] nums2 = new int[2*nums.length];
        for (int i = 0; i<nums.length;i++){
            nums2[i]=nums[i];
            nums2[i+nums.length]=nums[i];
        }
        return nums2;
    }
    
}
