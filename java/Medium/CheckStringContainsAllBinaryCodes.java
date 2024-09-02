package Medium;

import java.util.HashSet;
import java.util.Set;

public class CheckStringContainsAllBinaryCodes {
    public static void main(String[] args){
        String s = "00110";
        int k = 3;
        System.out.println(hasAllCodes2(s, k));
    }

    public static boolean hasAllCodes(String s, int k) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i < s.length() + 1 - k ; i++){
            set.add(s.substring(i, i + k));
        }
        if(set.size() == (int) Math.pow(2, k)) return true;
        return false;
    }

    public static boolean hasAllCodes2(String s, int k) {
        int l = s.length();
        int m = 1 << k;
        if(k > l || m > l) return false;
        //take the last letters of the string
        int n = Integer.parseInt(s.substring(l - k), 2);
        // creates a logical array with the size of all posibilities
        boolean[] hac = new boolean[m];
        hac[n] = true;
        m--;
        for(int i = l - k; i >= 0; i--){
            // if the next letter is 0, shift one bit(devide by 2), 
            n = s.charAt(i) == '0' ? (n >> 1) : ((n >> 1) + (1 << (k-1)));
            if(!hac[n]){
                hac[n] = true;
                m--;
            }
            if(i < m) return false;
            if(m == 0) return true;
        }
        return false;
    }
}
