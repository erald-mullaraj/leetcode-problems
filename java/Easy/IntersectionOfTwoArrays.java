package Easy;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    
    public static void main(String[] args){
        int[] nums1 = {1000, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] f = new int[1001];
        int[] r = new int[nums1.length];
        int j = 0;
        for(int i = 0; i < nums1.length; i++){
            f[nums1[i]]++;
        }
        for(int i = 0; i < nums2.length; i++){
            if(f[nums2[i]] != 0){
                f[nums2[i]] = 0;
                r[j] = nums2[i];
                j++;
            }
        }
        int[] fr = new int[j];
        for(int i = 0; i < j; i++){
            fr[i] = r[i];
        }
        return fr;
    }
}
