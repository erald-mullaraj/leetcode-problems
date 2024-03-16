package Easy;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] a = {2,14,18,22,22};
        System.out.println(containsDuplicateHashSet(a));
    }
    public static boolean containsDuplicateBF(int[] nums){
        int l = nums.length;
        for (int i = 0;i < l; i ++){
            for (int j = i+1; j< l;j++){
                if (nums[i]==nums[j]){
                    return true;
                }
            } 
        }
        return false;
    }

    public static boolean containsDuplicateHashSet(int[] nums){
        HashSet<Integer> a = new HashSet<Integer>();
        for (int i = 0;i < nums.length; i ++){
            if (a.contains(nums[i])){
                return true;
            }
            a.add(nums[i]);
        }
        return false;
    }
}