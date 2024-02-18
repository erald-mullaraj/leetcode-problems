package Easy;

public class LengthOfTheLastWord {
    public static void main(String[] args) {
        String s = new String();
        s = "sdsdfsd fasdfa s   ";
        System.out.println(lengthOfLastWord(s));
    }

    static public int lengthOfLastWord(String s) {
        int nr = 0;
        for (int i = s.length()-1; i >= 0;i--){
            if (s.charAt(i) != ' '){
                nr=1;
                for (int j = i-1;j>=0;j--){
                    if (s.charAt(j) != ' '){
                        nr++;
                    } else {
                        break;
                    }
                }
                if (nr>1){
                    break;
                }
            }
        }
        return nr;
    }
}