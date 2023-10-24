package Medium;

import java.util.Arrays;

public class SortAnArray {
    public static void main(String[] args) {
        
        int[] nums = {5, 2, 3, 1, 5, 2, 3, 1};
        Solution2.sortArray(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortArray1(nums)));
    }
    public static int[] sortArray1(int[] nums) {
        if(nums.length == 1){
            return nums;
        }
        mergeSort(nums, 0, nums.length -1);
        return nums;
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l)/2;
            mergeSort(arr, l, m);
            mergeSort(arr , m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] ll = new int[n1];
        int[] rr= new int[n2];
        for(int i = 0;i < n1; i++) {
            ll[i] = arr[l+i];
        }
        for(int i = 0;i < n2; i++) {
            rr[i] = arr[m+1+i];
        }
        int i = 0, j = 0, k =l;
        while(i < n1 && j < n2) {
            if(ll[i] <= rr[j]) {
                arr[k++] = ll[i++];
            }
            else {
                arr[k++] = rr[j++];
            }
        }
        while(i < n1) {
            arr[k++] = ll[i++];
        }
        while(j < n2) {
            arr[k++] = rr[j++];
        }
    }
}

class Solution2 {
    public static int[] sortArray(int[] nums) {
        int[] freq = new int[100001]; 
        int i = 0, j = 0;
        for(int val : nums) {
            freq[val + 50000]++;
        }      
        while(j<100001){
            int c = 0;
            while(c < freq[j]){
                nums[i++] = j - 50000;
                c++;
            }
            j++;
        }
        return nums;
    }
}
