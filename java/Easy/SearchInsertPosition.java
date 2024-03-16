package Easy;

public class SearchInsertPosition {
    
    public static void main(String[] args){
        int[] nums = {1, 3, 4, 5, 6};
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target){
        int st = 0;
        int fin = nums.length - 1;

        if(target < nums[0]){
            return 0;
        }

        if(target > nums[fin]){
            return fin + 1;
        }

        while(st < fin){
            int m = st + (fin - st)/2;
            if(target == nums[m]){
                return m;
            } else if(target > nums[m]){
                st = m + 1;
            } else {
                fin = m - 1;
            }
        }

        return st;
    }
}
