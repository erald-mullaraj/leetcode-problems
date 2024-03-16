package Easy;

class ValidPalindrome2 {

    public static void main(String[] args){
            String s = "eccer";
            System.out.println(validPalindrome(s));
        }

    public static boolean validPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        while (l < r) {
            if (s.charAt(l) == s.charAt(r)){
                l++; 
                r--;
            } else {
                boolean a = verify(s, l+1, r);
                boolean b = verify(s, l, r-1);
                return a || b;
            }
        }
        return true;
    }
    
        
    public static boolean verify(String s, int l, int r) {
        while (l < r) {
            System.out.println(s.charAt(l) + " " + s.charAt(r));
            if (s.charAt(l) == s.charAt(r)){
                l++; 
                r--;
            } else {
                return false;
            } 
        }
        return true;
    }
}

