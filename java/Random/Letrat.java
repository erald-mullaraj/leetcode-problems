package Random;

public class Letrat {

    static double PI = 3.14;
    static long MOONDISTANCE = 384400000; // in meters

    public static double gjejGjatesine(double innerRadius, double thickness, double height){
        double gjatesia = 0;
        for (double r = 0; r < height; r += thickness){
            gjatesia = gjatesia + PI * 2 * (innerRadius + r + thickness/2);
        }
        
        return gjatesia;
    }

    // per performance me te shpejte pa perdorur loop
    public static double gjejGjatesine2(double innerRadius, double thickness, double height){
        double gjatesia = 0;
        
        gjatesia =PI * 2 * (height/thickness) * ((innerRadius + thickness/2) + (innerRadius + height - thickness/2))/2;
            
        //pjestojm me 10 per ta kthyer ne m
        return gjatesia;
    }

    // MoonDistance ~= 384.400.000.000 mm;
    // MoonDistance = PI * 2  * (height/0.5) * ((50 + 0.25) + (50 - 0.25 + height))/2
    // height*height + 100 * height - MoonDistance / (PI * 2) =  0     --->  a = 1; b = 100; c ~= -61.210.191.082 mm
    // x = (-b + sqrt(b*b - 4*a*c))/2*a  --->   x = 247.357mm 

    public static void main(String[] args){

        System.out.println(gjejGjatesine(50, 0.5, 50)); 
        //gjeresia e letres per te shkuar deri ne hene = 247357mm;     
        System.out.println(gjejGjatesine2(50, 0.5,247357));
        
    }

}
    
