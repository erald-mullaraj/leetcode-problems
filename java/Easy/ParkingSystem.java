package Easy;

public class ParkingSystem {

    int[] pspace = new int[4];
    
    public ParkingSystem(int big, int medium, int small) {
        pspace[1] = big;
        pspace[2] = medium;
        pspace[3] = small;
    }
    
    public boolean addCar(int carType){
        if(pspace[carType] > 0){
            pspace[carType]--;
            return true;
        } 
        return false;
    }
}

class TstPark {

    public static void main(String[] args){
        ParkingSystem obj = new ParkingSystem(2, 2, 1);
        boolean p1 = obj.addCar(2);
        boolean p2 = obj.addCar(2);
        boolean p3 = obj.addCar(2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
