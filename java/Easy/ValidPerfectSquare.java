package Easy;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        int num = 9;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        long i = 0;
        long r = num;
        while(i <= r){
            long m = (i + r)/2;
            if(m*m == num){
                return true;
            }
            if (m*m > num){
                r = m - 1;
            } else {
                i = m + 1;
            }
        }
        return false;
    }
    
}
