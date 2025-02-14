package Medium;

import java.util.Arrays;

public class MinimumPenaltyForShop {
    
    public static void main(String[] args){
        String customers = "NYYNNY";
        System.out.println(bestClosingTime(customers));
        System.out.println(bestClosingTime2(customers));
    }

    public static int bestClosingTime(String customers) {
        int n = customers.length();
        int r = n;
        int pen = 0;
        int min = 0;

        for(int i = n - 1; i >= 0; i--) {
            if(customers.charAt(i) == 'N'){
                pen--;
                if(pen <= min) {
                    min = pen;
                    r = i;
                }
            } else {
                pen++;
            }
        }
        return r;
    }

    public static int bestClosingTime2(String customers){
        int[] tmp = new int[customers.length() + 1];
        int[] pen = new int[customers.length() + 1];
        int y = 0;
        int n = 0;

        for(int i = 0; i < customers.length(); i++){
            if(customers.charAt(i) == 'Y'){
                tmp[i] = ++y;
            }
            if(customers.charAt(i) == 'N'){
                tmp[i] = --n;
            }
        }
        int tmpn = 0;
        int tmpy = 0;
        int minp = customers.length();
        int r = 0;
        for(int i = 0; i < customers.length() + 1; i++){
            if(tmp[i] < 0){
                pen[i] = y - tmpy - tmpn;
                tmpn--;
            } else {
                pen[i] = y - tmpy - tmpn;
                tmpy++;
            }
            if(pen[i] < minp){
                minp = pen[i];
                r = i;
            }
            
        }
        
        return r;
    }

    public static int bestClosingTime3(String customers) {
        int[] pen = new int[customers.length() + 1];
        for(int i = 0; i < customers.length() + 1; i++){
            for(int j = 0; j < customers.length(); j++){
                if(i <= j){
                    if(customers.charAt(j) == 'Y'){
                        pen[i]++;
                    }
                } else {
                    if(customers.charAt(j) == 'N'){
                        pen[i]++;
                    }
                }
                
            }
        }
        int r = 0;
        int min = pen[0];
        for(int i = 1; i < pen.length; i++){
            if(pen[i] < min){
                min = pen[i];
                r = i;
            } 
        }
        return r;
    }
}
