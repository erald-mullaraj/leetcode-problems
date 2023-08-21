import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdba";
        System.out.println('b'-'a');
        System.out.println(isAnagram2(s1, s2));

    }
    public static boolean isAnagram(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if (sl!=tl){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < sl; i++){
            if (!map.containsKey(s.charAt(i))){
                int freq = 1;
                for (int j = i + 1; j < sl; j++){
                    if (s.charAt(i)==s.charAt(j)){
                        freq +=1; 
                    }
                }
                map.put(s.charAt(i),freq);
            }
            if (!map2.containsKey(t.charAt(i))){
                int freq2 = 1;
                for (int j = i + 1; j < sl; j++){
                    if (t.charAt(i)==t.charAt(j)){
                        freq2 +=1;
                    }
                }
                map2.put(t.charAt(i),freq2);
            }
        }
        for (Character key : map.keySet()){
            if (map.get(key) != map2.get(key)){
                return false;
            }
        }
        return true;    
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i<s.length();i++){
            a += (int)s.charAt(i)/3*(int)s.charAt(i);
            b += (int)t.charAt(i)/3*(int)t.charAt(i);
        }
        if (a==b)
            return true;
        return false;
    }
}