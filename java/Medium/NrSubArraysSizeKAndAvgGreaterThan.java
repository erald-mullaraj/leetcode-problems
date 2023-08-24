public class NrSubArraysSizeKAndAvgGreaterThan {

    public static void main(String[] args) {
        int[] a = {2,14,18,22};
        int b = 3; 
        int c = 14;
        System.out.println(numOfSubarrays(a, b, c));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int thr = 0;
        int sum = 0;
        for (int j = 0; j < k; j++){
            sum += arr[j];
        }
        if(sum/k >= threshold){
            thr++;
        }
        for (int i = k; i < arr.length; i++){
            sum += arr[i] - arr[i-k];
            if(sum/k >= threshold){
            thr++;
        }
        }
        return thr;
    }
}
