/**
 * @param {number} n
 * @return {number}
 */
var tribonacci = function(n) {
    if(n == 0) return 0;
    if(n == 1 || n == 2) return 1;
    var t1 = 0;
    var t2 = 1;
    var t3 = 1;
    for(let i = 0; i < n - 2; i++){
        r = t1 + t2 + t3;
        t1 = t2;
        t2 = t3;
        t3 = r;
    }
    return r;
};

console.log(tribonacci(5));


        
