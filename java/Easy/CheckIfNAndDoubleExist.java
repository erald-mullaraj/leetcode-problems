package Easy;

public class CheckIfNAndDoubleExist {
    public static void main(String[] arg){
        int[] arr = {10, 2, 5, 3};
        int[] arr2 = {-2,0,10,-19,4,6,-8};
        System.out.println(checkIfExist(arr));
        System.out.println(checkIfExist(arr2));
    }

    public static boolean checkIfExist(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            
            for(int j = 0; j < arr.length; j++){
                if(i == j) continue;
                if(arr[i] == 2 * arr[j]){
                    System.out.println(i + " " + j);
                    return true;
                }
            }
            
        }
        return false;
    }
}
