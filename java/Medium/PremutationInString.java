package Medium;

import java.util.Arrays;

public class PremutationInString {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "aabcaaa";
        System.out.println(checkInclusion(s1, s2));
    }
    public static boolean checkInclusion(String s1, String s2) {
        int a = s1.length();
        int b = s2.length();
        int i = 0;
        int j = 0;
        int[] freq = new int[26];
        int[] freq2 = new int[26];
        while(i < a){
            freq[s1.charAt(i++) - 'a']++;
        }
        while (j < b) {
            freq2[s2.charAt(j) - 'a']++;
            if (j >= a) {
                freq2[s2.charAt(j - a) - 'a']--;
            }
            if (Arrays.equals(freq, freq2)){
                return true;
            }
            j++;
        }
        return false;
    }
}
