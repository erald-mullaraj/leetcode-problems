package Easy;

public class NthTribonacciNuber {
    public static void main(String[] args){
        System.out.println(tribonacci2(2));
    }

    // recursive
    public static int tribonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 2 || n == 1){
            return 1;
        }
        else {
            return tribonacci(n-1) + tribonacci(n - 2) + tribonacci(n - 3);
        }
    }

    public static int tribonacci2(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int r = 0;
        int t1 = 0;
        int t2 = 1;
        int t3 = 1;
        for(int i = 0; i < n - 2; i++){
            r = t1 + t2 + t3;
            t1 = t2;
            t2 = t3;
            t3 = r;
        }
        return r;
    }
}
