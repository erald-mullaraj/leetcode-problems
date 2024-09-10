package Medium;

public class OptimalPartitionOfString {
    public static void main(String[] args){
        String s = "abcdbacvbbbb";
        System.out.println(partitionString2(s));
    }

    public static int partitionString(String s) {
        int[] f = new int[27];
        int r = 1;
        for(int i = 0; i < s.length(); i++){
            if(f[s.charAt(i) - 'a'] == 1){
                r++;
                f = new int[27];
                f[s.charAt(i) - 'a'] = 1;
            } else {
                f[s.charAt(i) - 'a'] = 1;
            }
        }
        return r;
    }

    public static int partitionString2(String s){
        int r = 1, m = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            // shifts nr 1 to the left
            int t = 1 << (ch[i] - 'a');
            // performs logical "&" operator to the bits of m and t, than compares it to t
            if ((m & t) == t) {
                r++;
                m = t;
            // sets the bit corresponding to the current character ch[i] to m
            } else m |= t;
        }
        return r;
    }
}
