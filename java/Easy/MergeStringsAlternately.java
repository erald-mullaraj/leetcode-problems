package Easy;

public class MergeStringsAlternately {
    public static void main(String[] args) {
        String w1 = "abc";
        String w2 = "pqr";
        System.out.println(mergeAlternately(w1, w2));
    }

    public static String mergeAlternately(String word1, String word2) {
        int w1l = word1.length();
        int w2l = word2.length();
        int i = 0, j = 0;
        StringBuilder f = new StringBuilder();
        while(i < w1l && j < w2l){
            f.append(word1.charAt(i));
            f.append(word2.charAt(j));
            i += 1;
            j += 1;
        }
        if(w1l > w2l){
            while(i < w1l){
            f.append(word1.charAt(i));
            i += 1;
            }
        } else {
            while(j < w2l){
            f.append(word2.charAt(j));
            j += 1;
            }
        }
        return f.toString();
    }

    public static String mergeAlternately2(String word1, String word2) {
        int w1l = word1.length();
        int w2l = word2.length();
        int i = 0, j = 0;
        String f = new String();
        while(i < w1l && j < w2l){
            f += word1.charAt(i);
            f += word2.charAt(j);
            i += 1;
            j += 1;
        }
        if(w1l>w2l){
            while(i<w1l){
            f += word1.charAt(i);
            i += 1;
            }
        } else {
            while(j<w2l){
            f += word2.charAt(j);
            j += 1;
            }
        }

        return f;
    }
}
