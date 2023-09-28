package Easy;

public class RangeSumQueryImmutable {

    public int[] snums;
    public RangeSumQueryImmutable(int[] nums) {
        snums =nums;
        int i = 1;
        while(i<snums.length){
            snums[i] += snums[i-1];
            i++;
        }
    }
    
    public int sumRange(int left, int right) {

        if (left == 0) {
            return snums[right];
        }
        return snums[right] - snums[left - 1]; 
    }
}

class Run {

     public static void main(String[] srgs){
        int[] a = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable obj = new RangeSumQueryImmutable(a);
        int p1 = obj.sumRange(2,5);
        System.out.println(p1);
    }
}



