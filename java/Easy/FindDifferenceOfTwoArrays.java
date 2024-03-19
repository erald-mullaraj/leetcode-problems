package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDifferenceOfTwoArrays {
    public static void main(String[] args){
        int[] nums1 = {1,2,3,3,4,6};
        int[] nums2 = {1,1,2,2,5,5,10};
        System.out.println(findDifference2(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2){
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        int[] c = new int[2001];
        for(int i: nums1) c[i + 1000] = 1;
        for(int i: nums2) c[i + 1000] = c[i+1000] == 1 || c[i+1000] == 3 ? 3 : 2; 
        for(int i: nums1) if(c[i + 1000] == 1){
            l1.add(i); c[i + 1000] = 3;
        } 
        for(int i: nums2) if(c[i + 1000] == 2){
            l2.add(i); c[i + 1000] = 3;
        } 
        return List.of(l1, l2);
    }

    public static List<List<Integer>> findDifference2(int[] nums1, int[] nums2){
        List<Integer> a1 = new ArrayList<Integer>();
        List<Integer> a2 = new ArrayList<Integer>();
        Set<Integer> s = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums1){
            s.add(i);
            s2.add(i);
        } 
        for(int i: nums2){
            if(s.contains(i)){
                s2.remove(i);
            } else {
                s.add(i);
                a2.add(i);
            }
        }
        for(int i: s2) a1.add(i);
        return List.of(a1, a2);
    }

}
