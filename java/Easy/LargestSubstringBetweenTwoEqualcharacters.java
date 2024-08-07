package Easy;

public class LargestSubstringBetweenTwoEqualcharacters {
    public static void main(String[] args){
        String s = "aa";
        String s2 = "abca";
        String s3 = "abscd";
        System.out.println(maxLengthBetweenEqualCharacters(s));
        System.out.println(maxLengthBetweenEqualCharacters(s2));
        System.out.println(maxLengthBetweenEqualCharacters(s3));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int d = -1;
        int[][] l = new int[26][2];
        for(int i = 0; i < s.length(); i++){
            if(l[s.charAt(i) - 'a'][0] != 0){
                d = Math.max(i - l[s.charAt(i) - 'a'][1] -1, d);
            } else {
                l[s.charAt(i) - 'a'][0]++;
                l[s.charAt(i) - 'a'][1] = i;
            }
        }
        return d;
    }
}
