/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n){
    let a = 0;
    while(a != 4){
        a = 0;
        while(n > 0){
            let r = n%10;
            a += r * r;
            n = parseInt(n/10);
        }
        if(a == 1){
            return true;
        }
        console.log(a);
        n = a;
    }
    return false;
}

console.log(isHappy(7));