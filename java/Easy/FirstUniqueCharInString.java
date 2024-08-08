package Easy;

public class FirstUniqueCharInString {
    public static void main(String[] args){
        String s = "leetcode";
        String s2 = "loveleetcode";
        String s3 = "aabb";

        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s2));
        System.out.println(firstUniqChar(s3));
    }

    public static int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        int[] f = new int[26];
        for(int i = 0; i < c.length; i++){
            f[c[i] - 'a']++;
        }
        for(int i = 0; i < s.length(); i++){
            if(f[c[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
