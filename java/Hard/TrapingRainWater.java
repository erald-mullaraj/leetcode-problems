public class TrapingRainWater {

    public static int trap(int[] height) {
        int hMax = 0;
        int indx = 0;
        int barVol = 0;
        int wtrap = 0;
        for (int i =0;i<height.length;i++){
            if (height[i] >= hMax){
                if ((i-indx)>1){
                    for(int j = indx;j<i;j++){
                        barVol = barVol + height[j];
                    }
                    wtrap = wtrap + (hMax*(i-indx) - barVol);
                    barVol = 0;
                }
                indx = i;
                hMax = height[i];
                System.out.println("hMax: " + hMax + " barVol: " + barVol + " wtrap: " + wtrap + " index: " + indx +  " barvol: " + barVol);
            }
        }
        hMax = 0;
        indx = height.length-1;
        for (int i =height.length-1;i>=0;i--){
            if (height[i] > hMax){
                if ((indx-i)>1){
                    for(int j = indx;j>i;j--){
                        barVol = barVol + height[j];
                    }
                    wtrap = wtrap + (hMax*(indx-i) - barVol);
                    barVol = 0;
                }
                indx = i;
                hMax = height[i];
                System.out.println("__hMax: " + hMax + " barVol: " + barVol + " wtrap: " + wtrap + " index: " + indx +  " barvol: " + barVol);
            }
        }
    return wtrap;
    }
}
