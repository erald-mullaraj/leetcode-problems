public class IsSubsequence {

    public static void main(String[] args){
        String a = "acc";
        String b = "ahbcgdbc";
        System.out.println(isSubsequence(a,b));
     
    }
    private static boolean isSubsequence(String s, String t) {
        int found = 0;
        int jIndx = 0;
        for (int i = 0; i < s.length(); i ++){
            for (int j = jIndx; j < t.length(); j++){
                if (s.charAt(i)==t.charAt(j)){
                    found++;
                    jIndx = j+1;
                    break;
                }
            }
        }
        if (s.length()==found){
            return true;
        } else {
            return false;
        }
    }
}

