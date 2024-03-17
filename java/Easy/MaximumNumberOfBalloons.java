package Easy;

import java.util.Arrays;

public class MaximumNumberOfBalloons {

    public static void main(String[] args) {
        String a = "bababalloooooolllllnnn";
        System.out.println(maxNumberOfBalloons(a));
    }

    public static int maxNumberOfBalloons(String text) {

        int res = Integer.MAX_VALUE;;
        int[] freq = new int[26];
        for (char c : text.toCharArray()){
            freq[c - 'a'] ++;
        }
        freq['l' - 'a'] = freq['l' - 'a']/2;
        freq['o' - 'a'] = freq['o' - 'a']/2;

        for (char c : new char[] {'b', 'a', 'n', 'o', 'l'})
        res = Math.min(res, freq[c - 'a']);

        System.out.println(Arrays.toString(freq));

        return res;
    }

    public static int maxNumberOfBalloons2(String text) {

        int res = 0;
        int[] freq = new int[26];
        for (char c : text.toCharArray()){
            freq[c - 'a'] ++;
        }
        
        while(freq['a'-'a'] > 0 && freq['b' - 'a'] > 0 && freq['l' - 'a'] > 1 
        && freq['n' - 'a'] > 0 && freq['o' - 'a'] > 1){
            freq['a'-'a']--;
            freq['b'-'a']--;
            freq['n'-'a']--;
            freq['l'-'a'] -=2;
            freq['o'-'a'] -=2;
            res++;
        }

        return res;
    }
}
