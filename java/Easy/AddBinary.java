package Easy;

public class AddBinary {

    public static void main(String[] args){
        String a = "11010";
        String b = "11";
        System.out.println(addBinary(a, b));
    }
    public static String addBinary(String a, String b) {
        int car = 0;
        String res = "";
        int al = a.length();
        int bl = b.length();
        int maxl = bl > al ? bl: al;
    
        for(int i = maxl -1; i >= 0; i--){
            int a1 =  maxl - al <= i ? a.charAt(i-maxl+al) - '0': 0;
            int b1 =  maxl - bl <= i ? b.charAt(i-maxl+bl) - '0': 0;
            int sum = a1 + b1 + car;
            res = sum%2 + res;
            car = sum/2;
        }
        if(car==1){
            res = car + res;
        }
        return res;
    }
}
