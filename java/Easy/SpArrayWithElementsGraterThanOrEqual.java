package Easy;

public class SpArrayWithElementsGraterThanOrEqual {
    public static void main(String[] args){
        int[] nums = {0,4,3,0, 4};
        System.out.println(specialArray(nums));

    }

    public static int specialArray(int[] nums) {
        int[] f = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < nums.length){
                f[nums[i]]++;
            } else {
                f[nums.length]++;
            }
            
        }
        int r = 0;
        for(int i = nums.length; i > 0; i--){
            r += f[i];
            if(r == i) return i;
        }
        return -1;
    }
}
