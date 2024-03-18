/**
 * @param {number[]} nums
 * @return {number}
 */
var arraySign = function(nums) {
    var r = 1;
    for(let i = 0; i < nums.length; i++){
        if(nums[i] == 0){
            return 0;
        } else if(nums[i] < 0){
            r *= -1;
        }
    }
    return r;
};

console.log(arraySign([1, 3, -1, 3, -1, -3]));