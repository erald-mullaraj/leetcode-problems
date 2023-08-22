public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] st = {"flower", "fl", "floight"};
        System.out.println(longestCommonPrefix(st));
    }
    
    public static String longestCommonPrefix(String[] strs) {
        String s = "";
        for (int i = 0; i< strs[0].length();i++){
            try {
                for (int j = 1; j<strs.length;j++){
                    if (i == strs[j].length() || strs[j].charAt(i)!=strs[0].charAt(i)){
                        return s;
                    }
                }
                s = s + strs[0].charAt(i);
            } catch(Exception e){
                return s;
            }
        }
        return s;
    }
}
