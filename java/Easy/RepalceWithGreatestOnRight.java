import java.util.Arrays;

public class RepalceWithGreatestOnRight {

    public static void main(String[] args) {
        int[] nums = {17,18,5,4,6,1};
        System.out.println(Arrays.toString(replaceElements(nums)));
    }

    public static int[] replaceElements(int[] arr) {
        int gr = -1;
        for(int j = arr.length-1; j>=0; j--){
            if(arr[j]>gr){
                int t = gr;
                gr = arr[j];
                arr[j]= t;
            } else {
                arr[j]= gr;
            }
            
        }
        return arr;
    }
}
