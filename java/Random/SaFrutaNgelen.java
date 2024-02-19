package Random;

public class SaFrutaNgelen {
    
    public static void main(String[] args){
        int [] a = {2, 2, 2, 2, 3, 1};
        System.out.println(saNgelen(a));
    }

    public static int saNgelen(int[] frutat){
        int f = frutat[0];
        int r = 0;
        for(int i = 0; i < frutat.length; i++){
            if (f == frutat[i]){
                r++;
            } else if(f != frutat[i] && r == 0){
                f = frutat[i];
                r++;
            } else if(f != frutat[i] && r == 1){
                f = 0;
                r--;
            } else {
                r--;
            }
        }
        return r;
    }
}
