package Medium;

public class Pow {

    public static void main(String[] args) {
                
        System.out.println(thePow(2, -2147483648));
    }

    public static double thePow(double x, int n ) {
        return Math.pow(x,n);
    }

    public static double myPow(double x, int n) {
        int i = 0; double a=1;
        if (x==0){
            return 0;
        }
        if (x==1){
            return 1;
        }
        if (x==-1){
        return x = n%2==0 ? 1: -1;
        }
        if (n>0){
            while(i<n){
                a = a * x;
                i++;
            }
            return a;
        } else if (n<0){
            while(i>n){
                a = a *x;
                i--;
            }
            return 1/a;
        }
        return a;
    }
    
}
