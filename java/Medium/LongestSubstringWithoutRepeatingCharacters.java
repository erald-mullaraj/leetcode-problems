package Medium;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String a = "adal;djf;alksdfj";
        System.out.println(lengthOfLongestSubstringa(a));
    }

    public static int lengthOfLongestSubstringa(String s) {
        int[] chIndx = new int[128];
        int str = 0;
        int end= 0;
        int maxL = 0;
        while(end < s.length()){
            char c = s.charAt(end);
            if (chIndx[c] > str){
                str = chIndx[c];
            }
            chIndx[c] = end + 1;
            maxL = Math.max(maxL, end - str + 1);
            end++;
         }
         return maxL;
     }
}
