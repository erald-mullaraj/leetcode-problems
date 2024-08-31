package Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequence {
    public static void main(String[] args){
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences2(s));
    }

    public static List<String> findRepeatedDnaSequences2(String s) {
        Set<String> r = new HashSet<>();
        Set<String> vd = new HashSet<>();
        List<String> ans = new ArrayList<>();
        if(s.length() <= 10) return ans;
        for(int i = 0; i <= s.length() - 10; i++){
            String st = s.substring(i, i + 10);
            if(!vd.add(st)) r.add(st);
        }
        ans.addAll(r);
        return ans;
    }
}
