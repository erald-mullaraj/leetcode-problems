package Easy;

public class RemoveDuplicatesFromSortedArray2 {
    public static void main(String[] args) {
        int nums1[] = new int[]{0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(nums1));
    }

    public static int removeDuplicates(int[] nums) {
        if(nums.length <= 1){
            return 1;
        }
        int j = 1;
        int i = 0;
        if(nums[0]==nums[1]){
            j++;
            i++;
        }
        while(i<nums.length-2){
            if (nums[i] != nums[i+1] && nums[i+1] == nums[i+2]){
                nums[j++] = nums[i+1];
                nums[j++] = nums[i+1];
                i++;
            }
            if (nums[i] != nums[i+1]){
                nums[j++] = nums[i+1];
            }
            i++;
        }
        if (nums[nums.length-2] != nums[nums.length-1]){
                nums[j++] = nums[i+1];
            }
        return j;
    }
}
