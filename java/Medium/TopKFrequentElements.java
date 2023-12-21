package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static void main(String[] args){
        int[] num = {1};
        System.out.println(Arrays.toString(topKFrequent(num, 2)));
    }
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> nrFreq = new HashMap<>();
        List<Integer> freqArray[] = new ArrayList[nums.length + 1];                
        
        for (int n : nums){
            // count the occurrances of the numbers
            nrFreq.merge(n, 1, Integer::sum);
        }
            
        for (int n : nrFreq.keySet()){
            int val = nrFreq.get(n);
            if (freqArray[val] == null){
                freqArray[val] = new ArrayList<>();
            }
            freqArray[val].add(n);
        }
        
        int index = 0;
        int i = nums.length;
        int[] res = new int[k];
        while( i >= 0){
            if (freqArray[i] != null){
                for (int val : freqArray[i]){
                    res[index++] = val;
                    if(index == k){
                        return res;
                    }      
                }
            }
            i--;
        }
        return res;
    }
}
