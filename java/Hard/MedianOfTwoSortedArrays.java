package Hard;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args){
        int[] nums1 = {};
        int[] nums2 = {2};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        if(l1 == 0) {
            if(l2%2 == 0){
                return (nums2[(l2 - 1)/2] + nums2[l2/2])/2.0;
            } 
            else return nums2[l2/2];
        }
        if(l2 == 0) {
            if(l2%2 == 0){
                return (nums1[(l1 - 1)/2] + nums1[l1/2])/2.0;
            } 
            else return nums1[l1/2];
        }
        int l = l1 + l2;
        
        int[] n = new int[l];
        int n1 = 0;
        int n2 = 0;
        double m;
        for(int i = 0; i < l; i++){
            if(nums1[n1] < nums2[n2]){
                n[i] = nums1[n1];
                n1++;
                if(n1 == l1) {
                    while(n2 < l2){
                        i++;
                        n[i] = nums2[n2];
                        n2++;
                    }
                }
            } else {
                n[i] = nums2[n2];
                n2++;
                if(n2 == l2) {
                    while(n1 < l1){
                        i++;
                        n[i] = nums1[n1];
                        n1++;
                    }
                }
            }
        }
        if(l%2 == 0){
            m = (n[(l - 1)/2] + n[l/2])/2.0;
        } 
        else m = n[l/2];
        return m;
    }
}
