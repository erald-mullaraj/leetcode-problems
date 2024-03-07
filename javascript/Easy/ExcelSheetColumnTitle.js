/**
 * @param {number} columnNumber
 * @return {string}
 */
var convertToTitle = function(columnNumber) {
    let r = "";
    while (columnNumber > 0) {
        columnNumber--;
        r = String.fromCharCode(columnNumber%26 + 65) + r;
        columnNumber = parseInt(columnNumber/26);
    }
    return r;
};

console.log(convertToTitle(53))