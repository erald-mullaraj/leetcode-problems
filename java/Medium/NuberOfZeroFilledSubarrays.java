package Medium;

public class NuberOfZeroFilledSubarrays {
    public static void main(String[] args){
        int[] nums = {0,0,0,2,0,0};
        System.out.println(zeroFilledSubarray2(nums));
    }

    public static long zeroFilledSubarray(int[] nums) {
        long r = 0;
        long t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                t++; 
            } else {
                r += subarrays(t);
                t = 0;
            }
        }
        if(nums[nums.length - 1] == 0){
            r += subarrays(t);
        }
        return r;
    }

    public static long subarrays(long a){
        long b = (a * a + a) >> 1;
        return b;
    }

    public static long zeroFilledSubarray2(int[] nums){
        long r = 0;
        int t = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) t++;
            else t = 0;
            r += t;
        }
        return r;
    }
}
