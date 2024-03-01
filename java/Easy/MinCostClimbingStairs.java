package Easy;

public class MinCostClimbingStairs {

    public static void main(String[] args){
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int f = 0;
        int s = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            cost[i] = f <= s ? (cost[i] + f) : (cost[i] + s);
            s = f;
            f = cost[i];
        }

        return cost[0] <= cost[1] ? cost[0] : cost[1];
    }
}
