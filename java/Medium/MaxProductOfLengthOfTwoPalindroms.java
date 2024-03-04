package Medium;

public class MaxProductOfLengthOfTwoPalindroms {

    public static void main(String[] args) {
        
        String s = "bb";
        System.out.println(maxProduct(s));
    }

    static int r;
    public static int maxProduct(String s){
        r = 0;
        sbsclc(s, "", "", 0);
        return r;
    }
    
    public static int plen(String sbs){
        int sl = sbs.length();
        if (sl == 0){
            return 0;
        }
        if (sl == 1){
            return 1;
        }
        else{
            return sbs.charAt(0) == sbs.charAt(sl - 1) ?
            plen(sbs.substring(1, sl - 1)) + 2 :
            Math.max(plen(sbs.substring(1)), plen(sbs.substring(0,sl -1)));
        }
    }

    public static void sbsclc(String s, String s1, String s2, int i){
        if (i == s.length()){
            r = Math.max(r, plen(s1) * plen(s2));
            return;
        }
        sbsclc(s, s1 + s.charAt(i), s2, i + 1);
        sbsclc(s, s1, s2 + s.charAt(i), i + 1);
    }
}
