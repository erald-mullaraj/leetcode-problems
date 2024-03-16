package Easy;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int nums1[] = new int[]{1,2,3,0};
        int nums2[] = new int[]{1};
        int m = 3; int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n-1;
        for (int j = l;j>=0;j--){
            if (n==0){
                break;   
            }
            else if (m==0){
                nums1[j] = nums2[n-1];
                n--;
            }
            else if (nums1[m-1] > nums2[n-1]){
                nums1[j] = nums1[m-1];
                m--;
            } else {
                nums1[j] = nums2[n-1];
                n--;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
    
}
