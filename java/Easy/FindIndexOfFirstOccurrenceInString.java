package Easy;

public class FindIndexOfFirstOccurrenceInString {
    public static void main(String[] args){
        String a = "ssadbutsad";
        String b = "sad";
        System.out.println(strStr(a, b));
    }

    public static int strStr(String haystack, String needle){
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            outerloop:
            if(needle.charAt(0) == haystack.charAt(i)){
                for(int j = 1; j < needle.length(); j++){
                    if(haystack.charAt(i + j) != needle.charAt(j)) break outerloop;
                }
                return i;
            }
            
        }
        return -1;
    }
}
