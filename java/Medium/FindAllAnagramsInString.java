package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args){

        String s = "cbaebabacd";
        String p = "abc";
        String s1 = "abab";
        String p2 = "ab";
        System.out.println(findAnagrams(s, p));
        System.out.println(findAnagrams(s1, p2));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> l = new ArrayList<>();
        int pl = p.length();
        int sl = s.length();
        if(pl > sl) return l;
        int[] sf = new int[27];
        int[] pf = new int[27];
        for(int i = 0; i < p.length(); i++){
            pf[p.charAt(i) - 'a']++;
            sf[s.charAt(i) - 'a']++;
        }
        for(int i = pl; i < sl; i++){
            for(int j = 0; j < 27; j++){
                if(pf[j] != sf[j]) break;
                if(j == 26) l.add(i - pl);
            }
            sf[s.charAt(i) - 'a']++;
            sf[s.charAt(i - pl) - 'a']--;
        }
        for(int j = 0; j < 27; j++){
            if(pf[j] != sf[j]) break;
            if(j == 26) l.add(sl - pl);
        }
        return l;
    }
}
