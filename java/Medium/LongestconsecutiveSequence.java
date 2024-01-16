package Medium;

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
}
