package Easy;

public class FindWordsFormedByCharacters {
    public static void main(String[] args){
        String[] words = {"cat", "bt", "hat", "tree"};
        String ch = "atach";
        System.out.println(countCharacters(words, ch));
    }

    public static int countCharacters(String[] words, String chars) {
        int r = 0;
        int[] c = new int[26];
        for(int i = 0; i < chars.length(); i++){
            c[chars.charAt(i) - 'a']++;
        }
        for(int i = 0; i < words.length; i++){
            if(counts(words[i], c)){
                r += words[i].length();
            }
        }
        return r;
    }

    public static boolean counts(String w, int[] charss){
        int[] a = new int[26];
        a = charss.clone();
        for(int i = 0; i < w.length(); i++){
            if(a[w.charAt(i) - 'a'] == 0) return false;
            a[w.charAt(i) - 'a']--;
        }
        return true;
    }
}
