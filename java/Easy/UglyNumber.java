package Easy;

public class UglyNumber {
    
    public static void main (String[] args){
        int n = 60;
        System.out.println(isUgly(n));
    }

    private static boolean isUgly(int n) {
        
        if(n <= 0) return false;

        int[] a = {2, 3, 5};

        for(int i = 0; i < 3; i++){
            while(n % a[i] == 0){
                n /= a[i];
            }
        }
   
        return n == 1;
    }
}