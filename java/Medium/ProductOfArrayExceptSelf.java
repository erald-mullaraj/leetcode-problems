package Medium;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args){
        int[] num = {1, 3, 4, 5, 6 ,7};
        System.out.println(Arrays.toString(productExceptSelf(num)));
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];
        int a = 1;

        for (int i = 0; i < l; i++){
            res[i] = a;
            a *= nums[i];
        } 
        
        a = 1;
        for (int i = l - 1; i >= 0; i--) {
            res[i] *= a;
            a *= nums[i];
        }
        return res;
    }
    
}
