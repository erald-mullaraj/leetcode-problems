package Random;

public class GetMinErrors {

    public static void main(String[] args){
        String eStr = "101!1";
        int x = 2, y = 3;
        System.out.println(getMinErrors(eStr, x, y));
    }

    public static int getMinErrors(String s, int x, int y){
        int [] errors = new int[2];
        int[] sbs0 = calcSubs(s, 0);
        int[] sbs1 = calcSubs(s, 1);
        errors[0] = ((sbs0[0]*x) % 1000000007 + (sbs0[1]*y) % 1000000007) % 1000000007;
        errors[1] = ((sbs1[0]*x) % 1000000007 + (sbs1[1]*y) % 1000000007) % 1000000007;

        return errors[0] <= errors[1] ? errors[0] : errors[1];
    }

    public static int[] calcSubs(String s, int a){
        int ones = 0;
        int zeros = 0;
        int[] sbs = new int[2];
        for(int i = 0; i < s.length(); i++){
            if(a == 0 && s.charAt(i) == '!'){
                zeros++;
                sbs[1] += ones;
            }
            if(a == 1 && s.charAt(i) == '!'){
                ones++;
                sbs[0] += zeros;
            }
            if(s.charAt(i) == '1'){
                ones++;
                sbs[0] += zeros;
            }
            if(s.charAt(i) == '0'){
                zeros++;
                sbs[1] += ones;
            }
        }
        return sbs;
    }
}
