/**
 * @param {number[]} cost
 * @return {number}
 */
var minCostClimbingStairs = function(cost) {
    let l = cost.length - 1;
    let f = 0;
    let s = 0;
    for(let i = l; i >= 0; i--){
        cost[i] += f <= s ? f : s;
        s = f;
        f = cost[i];
    }

    return cost[0] <= cost[1] ? cost[0] : cost[1];
};

let a = [1,100,1,1,1,100,1,1,100,1]
console.log(minCostClimbingStairs(a))