package Easy;

public class ExcelSheetColumnTitle {

    public static void main(String[] args){
        System.out.println(convertToTitle(703));
        System.out.println(Solution.convertToTitle(703));
    }
    public static String convertToTitle(int columnNumber) {
        String st = "";
        return helper(columnNumber, st);
    }

    static String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
    public static String helper(int nr, String str){
        if(nr < 27){
            str = s.charAt(nr - 1) + str;
            return str;
        }
        else {
            str = s.charAt(nr%26 == 0 ? 25 : nr%26 - 1) + str;
            return helper((nr-1)/26, str);
        }
    }
}

class Solution {
    public static String convertToTitle(int columnNumber) {
        StringBuilder r = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            r.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return r.toString();        
    }
}

