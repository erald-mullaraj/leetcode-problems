package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindAllNumbersDisappearedInArray {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> l = new ArrayList<>();
        int i = 1;
        int[] a = new int[nums.length];
        for(int n : nums){
            a[n-1]++;
        }
        while ( i < nums.length){
            if( a[i] == 0){
                l.add(i+1);
            }
            i++;
        }
        return l;
    }
    
    public static List<Integer> findDisappearedNumbers2(int[] nums) {

        List<Integer> l = new ArrayList<>();
        Set<Integer> a = new HashSet<>(nums.length);
        for(int n : nums){
            a.add(n);
        }
        for (int i = 1; i <= nums.length; i++){
            if( !a.contains(i) ){
                l.add(i);
            }
        }
        return l;
    }
}
