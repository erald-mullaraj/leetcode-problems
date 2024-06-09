package Easy;

public class MonotonicArray {

    public static void main(String[] args){
        int[] nums = {1, 2, 2, 4};
        int[] nums2 = {1, 3, 2};
        System.out.println(isMonotonic(nums));
        System.out.println(isMonotonic2(nums2));
    }
    public static boolean isMonotonic(int[] nums) {
        int l = nums.length; 
        if(l == 1) return true;
        int m = 0;
        for(int i = 1; i < l; i++){
            if(nums[i] > nums[i - 1]){
                if(m < 0){
                    return false;
                }
                m = 1;
            }
            if(nums[i] < nums[i - 1]){
                if(m > 0){
                    return false;
                }
                m = -1;
            }
        }
        return true;
    }

    public static boolean isMonotonic2(int[] nums) {
        if(nums.length == 1) return true;
        if(nums[0] < nums[nums.length-1]){
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i + 1]) return false;
            }
        } else {
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] < nums[i + 1]) return false;
            }
        }
        return true;
    }
}
