import java.util.ArrayList;
import java.util.List;

public class GroupAnagrams {

    public static void main(String[] args) {
        String[] s = {"a",""};
        System.out.println((groupAnagrams(s)));
    }
     public static List<List<String>> groupAnagrams(String[] strs) {
        int[] vst = new int[strs.length];
        List<List<String>> ll = new ArrayList<>();
        for (int i = 0;i <strs.length;i++){
            List<String> l = new ArrayList<>();
            if (vst[i]==0){
                l.add(strs[i]);
                System.out.println(l);
                for(int j = i+1; j<strs.length; j++){
                    if (vst[j] == 0&& isAnagram(strs[i], strs[j])){
                        System.out.println("im true");
                        vst[j] = 1;
                        l.add(strs[j]);
                    }
                }
                ll.add(l); 
                System.out.println(ll);
            }  
        }
        return ll;  
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int[] a = new int[26];
        for(int i=0; i < s.length(); i++){
            a[s.charAt(i) - 'a']++;
            a[t.charAt(i) - 'a']--;
        }
        for(int i=0; i < 26; i++){
            if(a[i] != 0) return false;
        }
        return true;
    }
}