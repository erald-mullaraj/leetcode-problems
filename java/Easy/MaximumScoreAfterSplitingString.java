package Easy;

public class MaximumScoreAfterSplitingString {

    public static void main(String[] args){
        String s2 = "0010110";
        long sTime = System.nanoTime();
        System.out.println(maxScore(s2));
        long eTime = System.nanoTime();
        System.out.println("time in miliseconds: " + (eTime - sTime) + " ns");


        long sTime2 = System.nanoTime();
        System.out.println(maxScore2(s2));
        long eTime2 = System.nanoTime();
        System.out.println("time in miliseconds: " + (eTime2 - sTime2) + " ns");
    }

    public static int maxScore(String s) {
        int r = 0;
        for(int i = 1; i < s.length(); i++){
            int a = 0;
            for(int j = 0; j < i; j++){
                if(s.charAt(j) == '0'){
                    a++;
                }
            }
            for(int k = i; k < s.length(); k++){
                if(s.charAt(k) == '1'){
                    a++;
                }
            }
            if(a > r){
                r = a;
            } 
        }
        return r;
    }

    public static int maxScore2(String s) {
        int r = 0;
        if(s.charAt(0) == '0'){
            r++;
        }
        if(s.charAt(s.length() - 1) == '1'){
            r++;
        }
        for(int i = 1; i < s.length()-1; i++){
            if(s.charAt(i) == '1'){
                r++;
            }
        }
        int a = r;
        for(int i = 1; i < s.length() -1; i++){
            if(s.charAt(i) == '0'){
                a++;
                if(a > r) r = a;
            } else {
                a--;
            }
        }
        return r;
    }
}
