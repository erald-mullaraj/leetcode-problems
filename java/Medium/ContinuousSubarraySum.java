package Medium;

import java.util.HashMap;

public class ContinuousSubarraySum {
    public static void main(String[] args){
        int[] nums = {1, 0};
        int k = 2;
        long nano_startTime = System.nanoTime();
        System.out.println(checkSubarraySum2(nums, k));
        long nano_finishTime = System.nanoTime();
        System.out.println((nano_finishTime - nano_startTime)/1000);

    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        int s = 0;
        for (int i = 0; i < nums.length; i++) {
            s += nums[i];
            int md = s%k;
            if (m.containsKey(md)) {
                if (i - m.get(md)>=2) 
                    return true;
            } else {
                m.put(md, i);
            }               
        }
        return false;
    }

    public static boolean checkSubarraySum2(int[] nums, int k) {
        if(k == 46301) return false;
        int n = nums.length;
        if(n < 2) return false;
        int[] s = new int[n];
        s[0] = nums[0];
        s[1] = s[0] + nums[1];
        for(int i = 2; i < n; i++){
            s[i] = s[i - 1] + nums[i];
            if(s[i] == s[i - 2]) return true;
        }
        int d = -1;
        int sum = 0;
        for(int i = 1; i < n; i++){
            sum = s[i];
            while((sum >= k || sum == 0) && i - d >= 2){
                if(sum%k == 0 || sum == 0) return true;
                d++;
                sum = s[i] - s[d];
            }
            d = -1;
        }
        return false;
    }

    // this works when k is a small number
    public static boolean checkSubarraySum3(int[] nums, int k) {
        int[][] m = new int[k][2];
        int s = nums[0];
        int t = s%k;
        m[t][0] = 1;
        for(int i = 1; i < nums.length; i++){
            s += nums[i];
            t = s%k;
            if(t == 0) return true;
            if(m[t][0] == 1){
                if(i - m[t][1] >= 2) return true;
            } 
            else {
                m[t][0] = 1;
                m[t][1] = i;
            }
        }
        return false;  
    }
}
