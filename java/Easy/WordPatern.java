package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class WordPatern {
    public static void main(String[] args) {
        String pattern = "abba"; 
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] wrds = s.split(" ");
        int l = pattern.length();
        if(l != wrds.length){
            return false;
        }
        String[] map = new String[26];
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < l; i++){
            if(map[pattern.charAt(i) - 'a'] == null){
                map[pattern.charAt(i) - 'a'] = wrds[i];
                if(set.contains(wrds[i])){
                    return false;
                } else {
                    set.add(wrds[i]);
                }
            }
            if (!map[pattern.charAt(i) - 'a'].equals(wrds[i])){
                return false;
            }
        }
        return true;
    }

    public static boolean wordPattern2(String pattern, String s) {
        String[] wrds = s.split(" ");
        int l = pattern.length();
        if(l != wrds.length){
            return false;
        }
        HashMap<Character, String> h = new HashMap<>();
        int i = 0;
        while (i <l){
            char c = pattern.charAt(i);
            if(h.containsKey(c)){
                if(!h.get(c).equals(wrds[i])){
                    return false;
                }

            } else {
                if (h.containsValue(wrds[i])){
                    return false;
                }
                h.put(c, wrds[i]);
            }
            i++;
        }
        return true;
    }
}
