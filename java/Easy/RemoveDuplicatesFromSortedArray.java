public class RemoveDuplicatesFromSortedArray {

    public static int[] removeDuplicates(int[] nums) {

        int j = 1;
        for (int i = 0; i < nums.length-1;i++){
            if (nums[i] != nums[i+1]){
                j++;
                nums[j-1] = nums[i+1];
            }
        }
        return nums;
    }
}