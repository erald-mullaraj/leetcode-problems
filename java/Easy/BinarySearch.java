package Easy;

public class BinarySearch {
    public static void main(String[] args){
        int[] nums = {-1, 3, 4, 5, 6, 24, 45};
        int target = -1;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int s = 0;
        int f = nums.length-1;
        if(target>nums[f] || target < nums[0]){
                return -1;
            }
        while(s <= f){
            int m = s + ( f - s )/2;
            if(target == nums[m]){
                return m;
            }else if(target > nums[m]){
                s = m + 1;
            }else{
                f = m - 1;
            }
        }
        return -1;
    }
    public static int search2(int[] nums, int target) {
        int i = 0;
        while(i < nums.length){
            if(nums[i]>target){
                break;
            }
            if(nums[i]==target){
                return i;
            }
            i++;
        }
        return -1;
    }
}