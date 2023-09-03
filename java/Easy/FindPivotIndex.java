public class FindPivotIndex {

    public static void main(String[] args){
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums){
        int lv = 0;
        int rv = 0;
        for(int nr : nums){
            rv += nr;
        }
        rv = rv - nums[0];
        if(rv==0){
            return 0;
        }
        for(int i = 1;i < nums.length;i++){
            lv += nums[i-1];
            rv -= nums[i];
            if( lv == rv){
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
