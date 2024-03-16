package Easy;

class HappyNumber{

    public static void main(String[] args){
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n){
        int a = 0;
        String s = Integer.toString(n);
        
        while(a != 4){
            a = 0;
            for(int j = 0; j < s.length(); j++){
                int b = Character.getNumericValue(s.charAt(j));
                a += b * b;
            }
            s = Integer.toString(a);
            if (a == 1) return true;
        }
        return false;
    }

    public static boolean isHappy2(int n){
        int a = 0;
        while(a != 4){
            a = 0;
            while(n > 0){
                int r = n % 10;
                a += r * r;
                n /= 10;
            }
            if (a == 1) return true;
            n = a;
        }
        return false;
    }
}