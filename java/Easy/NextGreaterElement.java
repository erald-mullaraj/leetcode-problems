package Easy;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,7,2,1};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        int l1 = nums1.length;
        int l2 = nums2.length;
        for(int i = 0; i < l1; i++){
            if (nums1[i]==nums2[l2-1]){
                    res[i] = -1;
                }
            outerloop:
            for (int j = 0; j<l2-1; j++){
                if(nums1[i]==nums2[j]){
                    for(int k = 0; k<l2 -j -1;k++){
                        if(nums2[j+k+1]>nums1[i]){
                            res[i] = nums2[j+k+1];
                            break outerloop;
                        } else {
                            res[i] = -1;
                        }
                    }
                    
                }
            }
        }
        return res;
    }
}
