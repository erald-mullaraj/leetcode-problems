package Medium;

public class NonDecreasingArray {
    public static void main(String[] args){
        int[] nums = { 1, 3};
        System.out.println(checkPossibility(nums));
    }

    public static boolean checkPossibility(int[] nums) {
        if(nums.length < 2) return true;
        boolean b = false;
        if(nums[1] < nums[0]) b = true;
        for(int i = 1; i < nums.length - 1; i++){
            if(nums[i + 1] < nums[i]) {
                if(b) return false;
                if(nums[i + 1] >= nums[i - 1]){
                    b = true;
                } else {
                    nums[i + 1] = nums[i];
                    b = true;
                }    
            }
        }
        return true;
    }
}
