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
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        if(s2%l == 0 && s1%l == 0){
            return str2.substring(0, l); 
        }

        for (int i = l/2; i > 0; i--){
            if(s2%i == 0 && s1%i == 0){
                return str2.substring(0, i);
            }
        }
        return "";
    }

    public static String gcdOfStrings2(String str1, String str2){
        int s1 = str1.length();
        int s2 = str2.length();
        if(!(str1 + str2).equals(str2 + str1)){
         return "";
        }
        return str1.substring(0, dv(s1, s2));
    }
    public static int dv(int a,int b){
        return b == 0 ? a : dv(b, a%b);
    }
}
