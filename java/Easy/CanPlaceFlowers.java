package Easy;

public class CanPlaceFlowers {

    public static void main(String[] args){
        int[] fl = {1, 0, 0, 0, 1, 0, 0, 0, 1};
        int n = 3;
        System.out.println(canPlaceFlowers(fl, n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int l = flowerbed.length;

        for(int i = 0; i < l; i++){
            if(n == 0){
                return true;
            }
            if((i == 0 || flowerbed[i-1] == 0) && (flowerbed[i] == 0) 
            && (i == l - 1 || flowerbed[i + 1] == 0)){
                flowerbed[i] = 1;
                n = n - 1;
            }
        }
        return n == 0;
    }
}
