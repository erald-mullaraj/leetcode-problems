package Easy;

public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        int f = 1;
        int s = 1;
        int t;
        int i = 0;

        while (i < n - 1) {
            t = f;
            f += s;
            s = t;
            i++;
        }
        return f;
    }
    
}
