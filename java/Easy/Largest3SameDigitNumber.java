package Easy;

public class Largest3SameDigitNumber {
    public static void main(String[] args){
        String num = "000677713333346999923";
        System.out.println(largestGoodInteger2(num));
    }

    public static String largestGoodInteger(String num) {
        int m = -1;
        for(int i = 0; i < num.length() - 2; i++){
            if(num.charAt(i) == num.charAt(i + 1) && num.charAt(i) == num.charAt(i + 2) ){
                if((int) num.charAt(i) - 48 > m){
                    m = (int) num.charAt(i) - 48;
                }
            }
        }
        if(m == -1) return "";
        String s = Integer.toString(m);
        return s + s + s;
    }

    public static String largestGoodInteger2(String num) {
        String[] r = {"000", "111", "222", "333", "444", "555", "666", "777", "888", "999"};
        for (int i = 9; i >= 0; i--){
            if(num.contains(r[i])){
                return r[i];
            }
        }
        return "";
    }
}
