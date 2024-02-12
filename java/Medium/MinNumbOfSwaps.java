package Medium;

public class MinNumbOfSwaps {

    public static void main(String[] args) {
        
        String s = "]]]][[[[";
        System.out.println(minSwaps2(s));

    }

    public static int minSwaps(String s) {
        int clBr = 0, max = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== ']') {
                clBr++;
                if(clBr > max){
                    max = clBr;
                }
            }
            else {
                clBr--;
            }
        }
        return (max + 1) / 2;
    }

    public static int minSwaps2(String s) {
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '[')
                max++;
            else if (max > 0)
                max--;
        }
        return (max + 1) / 2;
    }
}
