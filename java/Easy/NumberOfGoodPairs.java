package Easy;

public class NumberOfGoodPairs {

    public static void main(String[] args){
        int[] nums = {1, 2, 3, 1, 1, 3, 3, 3};
        int[] nums2 = {5, 5, 2, 2};
        System.out.println(numIdenticalPairs(nums));
        System.out.println(numIdenticalPairs(nums2));
    }
    public static int numIdenticalPairs(int[] nums) {
        int[] n = new int[101];
        int r = 0;
        for(int i = 0; i < nums.length; i++){
            n[nums[i]]++;
        }
        for(int i = 1; i < 101; i++){
            if(n[i] > 1){
                r += (n[i] * (n[i] - 1)) / 2;
            }
        }
        return r;
    }
}
