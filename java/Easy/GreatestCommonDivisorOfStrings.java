package Easy;

public class GreatestCommonDivisorOfStrings {

    public static void main(String[] args) {
        String s1 = "ABCABC";
        String s2 = "ABC";
        System.out.println(gcdOfStrings(s1, s2));
    }
    
    public static String gcdOfStrings(String str1, String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        int l = s2 < s1 ? s2 : s1;

        if(s2%l == 0 && s1%l == 0){
            if((str2.substring(0, l).repeat(s2/l).equals(str2)) &&
             (str2.substring(0, l).repeat(s1/l).equals(str1))){
                return str2.substring(0, l);
            }
        }

        for (int i = l/2; i > 0; i--){
            if(s2%i == 0 && s1%i == 0){
                if((str2.substring(0, i).repeat(s2/i).equals(str2)) &&
                 (str2.substring(0, i).repeat(s1/i).equals(str1))){
                    return str2.substring(0, i);
                }
            }
        }
        return "";
    }
}
