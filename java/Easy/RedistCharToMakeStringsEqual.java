package Easy;

public class RedistCharToMakeStringsEqual {
    
    public static void main(String[] args){
        String[] words = {"abc", "aabc", "bc"};
        System.out.println(makeEqual(words));
    }

    public static boolean makeEqual(String[] words){
        int[] a = new int[26];
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words[i].length(); j++){
                a[words[i].charAt(j) - 'a']++;
            }
        }
        for(int v: a){
            System.out.println(v);
            if(v % words.length != 0) return false;
        }
        return true;
    }
}
