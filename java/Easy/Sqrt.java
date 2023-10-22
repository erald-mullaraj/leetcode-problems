package Easy;

public class Sqrt {
    
    public static void main(String[] args) {
        int num = 65;
        System.out.println(mySqrt(num));
    }

    public static int mySqrt(int x) {
        long l = 0;
        long r = x;
        long m = 0;
        while(l <= r){
            m = (l + r)/2;
            if (m*m == x){
                return (int) m;
            }
            if (m*m < x){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return (int) (m*m < x ? m : m-1);
    }
}
