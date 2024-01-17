package Medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestconsecutiveSequence {

    public static void main(String[] args) {
        int[] nums = {1, 2, 7, 4, 5, 6};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> l = new HashSet<>();
        for(int n:nums) {
            l.add(n);
        }
        int max =1;
        for(int n: nums ){
            if(!l.contains(n-1)){
                 int count =1;
                 while(l.contains(n + 1)){
                     n++;
                     count++;
                 }
                 if (count > max){
                    max = count;
                 }
            }
            if(max > nums.length/2) {
                break;
            } 
        }
        return max;
     }

     public static int longestConsecutive2(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        int f = nums[0], count = 0, max = 1;
        for(int i=1; i<nums.length; i++){
            System.out.println(max);
            if(f + 1 == nums[i]){
                count++;
            }
            else if(f == nums[i]){
                continue;
            }
            else {
                if(count + 1 > max){
                    max = count + 1;
                }
                count = 0;
            }
            f = nums[i];
        }
        if(count + 1 > max){
            return count + 1;
        }
        return max;
    }
}
