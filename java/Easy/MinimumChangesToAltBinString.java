package Easy;

public class MinimumChangesToAltBinString {
    public static void main(String[] args){
        String s = "01001";
        System.out.println(minOperations(s));
    }
    public static int minOperations(String s) {
        int a = 0, b = 0;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) != '0') a++;
            else b++;
            i += 2;
        }
        i = 1;
        while(i < s.length()){
            if(s.charAt(i) != '1') a++;
            else b++;
            i += 2;
        }
        
        return (a < b) ? a : b;
    }
}
