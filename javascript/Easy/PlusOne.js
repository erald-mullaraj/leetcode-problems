/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function(digits) {
    let l = digits.length;
    let i = l - 1;
    while(digits[i] == 9){
        if(i == 0){
            digits[i] = 0;
            const a = new Array(l + 1);
            a[0] = 1;
            for(let j = 0; j < l; j++){
                a[j + 1] = digits[j];
            }
            return a;
        }
        digits[i] = 0;
        i--;
    }
    digits[i]++;
    return digits;
};

console.log(plusOne([1, 4, 9, 9]))