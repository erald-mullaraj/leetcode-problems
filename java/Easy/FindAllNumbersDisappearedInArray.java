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
