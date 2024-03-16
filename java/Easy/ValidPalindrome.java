package Easy;

public class ValidPalindrome {

    public static void main(String[] artgs){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome2(s));
    }
    public static boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        String s1 = "";
        for(char a : ch){
            if((a >= '0' & a <= '9') || (a >= 'a' && a <= 'z')){
                s1 = s1 + a;
            }
            if(a >= 'A' && a <= 'Z'){
                s1 = s1 + (char)(a+32);
            }
        }
         
        for(int i = 0; i < s1.length()/2;i++){
            if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String s) {
        int l = 0;
        int r = s.length()-1;
        
        while (l < r) {
            int lt = s.charAt(l);
            int rt = s.charAt(r);
            
            if (lt >= 65 && lt <= 90) {
                lt = lt+32;
            }
            if (rt >= 65 && rt <= 90) {
                rt = rt+32;
            }
            if (!(lt >= 97 && lt <= 122) && !(lt >= 48 && lt <= 57)) {
                l++;
                continue;
            }
            if (!(rt >= 97 && rt <= 122) && !(rt >= 48 && rt <= 57)) {
                r--;
                continue;
            }
            if (lt != rt){
                return false;
            } 
            l++; 
            r--;
        }
        return true;
    }
}
