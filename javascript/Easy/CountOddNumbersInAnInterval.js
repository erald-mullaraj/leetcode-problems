/**
 * @param {number} low
 * @param {number} high
 * @return {number}
 */
var countOdds = function(low, high) {
    return parseInt((high + 1) / 2) - parseInt(low / 2)
     
};

console.log(countOdds(3, 9))