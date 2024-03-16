package Easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int values[] = new int[]{4,4,0,1,0,2};
        System.out.println(removeElement(values,  0));
        System.out.println(Arrays.toString(values));
    }

    private static int removeElement(int[] nums, int val) {
        int k = 0;
        int l =nums.length-1;
        int lend = l;
        for (int i = 0;i <= l;i++){
            if (nums[i] == val){
                k++;
                for(int j = lend; j > i; j--){
                    if(nums[j]!=val){
                        nums[i] = nums[j];
                        nums[j] = val+1;
                        lend = j-1;
                        break;
                    }
                }
            } 
        }
        return l+1-k;
    } 
}