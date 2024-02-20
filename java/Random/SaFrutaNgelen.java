package Random;

public class SaFrutaNgelen {
    
    public static void main(String[] args){
        int [] a = {1, 1, 1, 5, 2, 1, 1, 4, 3};
        System.out.println(saNgelen(a));
    }

    public static int saNgelen(int[] frutat){
        int f = 0;
        int r = 0;
        for(int i = 0; i < frutat.length; i++){
            if (f == frutat[i]){
                r++;
            } else if(r == 0){
                f = frutat[i];
                r++;
            } else if(r == 1){
                f = 0;
                r--;
            } else {
                r--;
            }
        }
        return r;
    }
}
