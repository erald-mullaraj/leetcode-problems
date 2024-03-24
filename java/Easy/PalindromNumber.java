package Easy;

public class PalindromNumber {
    public static void main(String[] args){
        System.out.println(isPalindrome2(1291));

    }

    public static boolean isPalindrome(int x){
        if(x == 0) return true;
        if(x < 0 || (x % 10 == 0))
            return false;
        String s = String.valueOf(x);
        int l = s.length();
        for(int i = 0; i < l/2; i ++){
            if(s.charAt(i) !=  s.charAt(l - i - 1)) return false;
        }
        return true;
    }

    public static boolean isPalindrome2(int x){
        int a = 0;
        while(x > a){
            a = x%10 + a*10;
            x /= 10;
        }
        return x == a || x == a/10;
    }
}
