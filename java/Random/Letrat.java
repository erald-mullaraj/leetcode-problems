package Random;

public class Letrat {

    static double PI = 3.14;

    public static double gjejGjatesine(double innerRadius, double thickness, double height){
        double gjatesia = 0;
        for (double r = 0; r < height; r += thickness){
            gjatesia = gjatesia + PI * 2 * (innerRadius + r + thickness/2);
        }
        //pjestojm me 10 per ta kthyer ne cm
        return gjatesia/10;
    }

    // per performance me te shpejte pa perdorur loop
    public static double gjejGjatesine2(double innerRadius, double thickness, double height){
        double gjatesia = 0;
        
        gjatesia =PI * 2 * (height/thickness)* ((innerRadius + thickness/2) + (innerRadius + height - thickness/2))/2;
            
        //pjestojm me 10 per ta kthyer ne cm
        return gjatesia/10;
    }

    public static void main(String[] args){

        System.out.println(gjejGjatesine(50, 0.5, 1));
        System.out.println(gjejGjatesine2(50, 0.5, 1));
        
    }

}
    
