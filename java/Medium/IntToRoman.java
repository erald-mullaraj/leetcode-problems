public class IntToRoman {

    public static void main(String[] args){
        int a = 3;
        System.out.println(intToRoman(a));
    }

    public static  String intToRoman(int num) {
        int[] n = {1000,500,100,50,10,5,1};
        char[] l= {'M','D','C','L','X','V','I'};
        StringBuilder sb = new StringBuilder();
        int fnr = num/n[0];
        int rnr = num%n[0];
        while(fnr>0){
            sb.append(l[0]);
            fnr--;
        }
        num = rnr;
        for (int i = 2; i < 7; i+=2){
            fnr = num/n[i];
            rnr = num%n[i];
            if (fnr == 9){
                sb.append(l[i]);
                sb.append(l[i-2]);
            } else if (fnr == 4){
                sb.append(l[i]);
                sb.append(l[i-1]);
            } else if (fnr >= 5){
                sb.append(l[i-1]);
                while(fnr>5){
                sb.append(l[i]);
                fnr--;
                }
            } else if (fnr >= 0){
                while(fnr>0){
                sb.append(l[i]);
                fnr--;
                }
            }
            num = rnr;
        } 
        String s = sb.toString();
        return s; 
    }
}
