/**
 * @param {number}
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x == 0) return true;
    if(x < 0 || x%10 == 0){
        return false;
    }
    let a = 0;
    while(x > a){
        a = a * 10 + x%10
        x = parseInt(x/10)
    }
    return (x == a || x == parseInt(a/10))
}

console.log(isPalindrome(12321))