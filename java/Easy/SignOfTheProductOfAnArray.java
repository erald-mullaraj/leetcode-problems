package Easy;

public class SignOfTheProductOfAnArray {
    public static void main(String[] args){
        int[] a = {-1,1,-1,1,-1};
        System.out.println(arraySign(a));
    }

    public static int arraySign(int[] nums){
        int r = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                return 0;
            } else if(nums[i] < 0){
                r *= -1;
            }
        }
        return r;
    }
}
