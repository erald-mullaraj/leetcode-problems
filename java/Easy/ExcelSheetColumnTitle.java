package Easy;

public class ExcelSheetColumnTitle {

    public static void main(String[] args){
        System.out.println(convertToTitle(28));
    }
    public static String convertToTitle(int columnNumber) {
        helper(columnNumber);
        return str;
    }

    static String str = "";
    static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public static void helper(int nr){
        if(nr < 27){
            str = s.charAt(nr - 1) + str;
        }
        else {
            str = s.charAt(nr%26 == 0 ? 25 : nr%26 - 1) + str;
            helper((nr-1)/26);
        }
    }
}
