package Easy;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int rs = s.length - 1;
        while(l <= rs) {
            char tmp = s[l];
            s[l] = s[rs];
            l++;
            s[rs] = tmp;
            rs--;
        }
    }
}
