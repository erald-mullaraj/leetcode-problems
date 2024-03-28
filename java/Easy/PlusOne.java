package Easy;

import java.util.Arrays;

public class PlusOne {
    
    public static void main(String[] args){
        int[] d = {1, 5, 9, 9, 9,};
        System.out.println(Arrays.toString(plusOne(d)));
    }

    public static int[] plusOne(int[] digits) {
        int l = digits.length;
        int i = l - 1;
        while(digits[i] == 9){
            if(i == 0){
                digits[i] = 0;
                int ndg[] = new int[l + 1];
                ndg[0] = 1;
                for(int j = 0; j < l; j++){
                    ndg[j+1] = digits[j];
                }
                return ndg;
            }
            digits[i] = 0;
            i--;
        }
        digits[i]++;
        
        return digits;
    }
}
