package Easy;

public class IndexOfFirstOccurrenceInString {
    
    public static void main(String[] args) {
        String haystack = "adbutssssad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        int lh = haystack.length();
        int nh = needle.length();
        int l = lh - nh;
        for (int i= 0; i <= l; i++){
            outerloop:
            if (haystack.charAt(i) == needle.charAt(0)){
                for (int j = 1; j < nh; j++){
                    if (haystack.charAt(i+j)!=needle.charAt(j)){
                        break outerloop;
                    }
                }
                return i;
            }
        }
        return -1;
    } 
}
