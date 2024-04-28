package Easy;

public class RomanToIntiger {

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int nr = 0;
        String[] arr = s.split("");
        int len = s.length()-1;
        switch(arr[len]){
            case "M":
            nr = nr + 1000;
            break; 
            case "D":
            nr = nr + 500;
            break; 
            case "C":
            nr = nr + 100;
            break;
            case "L":
            nr = nr + 50;
            break;
            case "X":
            nr = nr + 10;
            break;   
            case "V":
            nr = nr + 5;
            break; 
            case "I":
            nr = nr + 1;
            break; 
        }
        for(int i = 0;i < len; i++){
            if (arr[i].equals("M"))
            nr = nr + 1000;
            else if (arr[i].equals("D"))
            nr = nr + 500;
            else if (arr[i].equals("L"))
            nr = nr + 50;
            else if (arr[i].equals("V"))
            nr = nr + 5;
            else if (arr[i].equals("C"))
            nr = (arr[i+1].equals("M") || arr[i+1].equals("D")) ? nr - 100 : nr + 100;
            else if (arr[i].equals("X"))
            nr = (arr[i+1].equals("C") || arr[i+1].equals("L")) ? nr - 10 : nr + 10;
            else if (arr[i].equals("I"))
            nr = (arr[i+1].equals("X") || arr[i+1].equals("V")) ? nr - 1 : nr + 1;         
        }
        return nr;        
    }

    public static int romanToInt2(String s) {
        int r = 0;
        int n = 0;
        int prev = 0;

        for(int i = s.length() - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }
            if(n < prev) r -= n;
            else r += n;

            prev = n;
        }
        return r;
    }
}