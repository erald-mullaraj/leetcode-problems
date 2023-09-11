import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
    
    public static void main(String[] atgs){
        int[] nums = { -1, -3};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums){
        Set<Integer> s = new HashSet<>();
        if(nums.length == 1){
            return nums[0]==1 ? 2 : 1;
        }
        for(int n : nums){
            if(n>0){
                s.add(n);
            }
        }
        int l = s.size();
        int i = 1;
        while(i <= l+1){
            if(!s.isEmpty() && s.contains(i)){
                i++;
            } else {
                return i;
            }
        }
        return i;
    }

    public int firstMissingPositive2(int[] nums) {
        int n = nums.length;
        int seen[]=new int[n+1];
        int r = n+1;
 
        for(int i=0;i<n;i++){
            if(nums[i] > 0 && nums[i] <= n){
                seen[nums[i]] = 1;
            }
        }
        for(int i = 1; i < seen.length; i++){
            if(seen[i] == 0){
                r = i;
                break;
            }
        }
        return r;
    }
}


    

