import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args){
        int[] nums = {3, 2, 1, 1, 2, 1, 1, 2};
        System.out.println(majorityElement((nums)));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length/2 + 1;
        Map<Integer, Integer> map = new HashMap<>();
        int m = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], 1);
            }
            if(map.get(nums[i])>=n){
                m = nums[i];
                break;
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return m;
    }

     public static int majorityElement2(int[] nums) {
        int n = nums.length/2 + 1;
        int r = nums[0];
        outerloop:
        for(int i = 0; i < nums.length; i++){
            int count = 1;
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                    if(count==n){
                        r = nums[i];
                        break outerloop;
                    }
                }
            }
        }
        return r;
    }
}
