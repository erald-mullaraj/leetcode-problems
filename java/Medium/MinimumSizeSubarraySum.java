package Medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(minSubArrayLen(15, nums));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 0;
        int res = nums.length+1;
        int sum = 0;
        while(r < nums.length){
            sum += nums[r];
            while(sum >= target){
                res = Math.min(r - l + 1, res);
                sum -= nums[l++];             
            }
            r++;
        }
        if(res == nums.length+1){
            return 0;
        }
        return res;
    }
}
