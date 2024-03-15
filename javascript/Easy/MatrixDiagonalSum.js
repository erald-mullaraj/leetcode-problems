/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat){
    var n = mat[0].length;
    let r = 0;
    for(let i = 0; i < n; i++){
        r += mat[i][i] + mat[i][n-i-1];
    }
    if(n%2 == 1){
       return r - mat[(n-1)/2][(n-1)/2]
    }
    return r;
}

let a = [[1, 2, 3,], [4, 5, 6], [7, 8, 9]];
console.log(diagonalSum(a))