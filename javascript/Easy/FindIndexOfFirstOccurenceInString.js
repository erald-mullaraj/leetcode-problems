/**
 * @param {string} heystack
 * @param {string} needle
 * @return {number}
 */

var strStr = function(haystack, needle){
    for(let i = 0; i <= haystack.length - needle.length; i++){
        loop:
        if(haystack[i] == needle[0]){
            for(let j = 1; j < needle.length; j++){
                if(haystack[i + j] != needle[j]){
                    break loop
                }
            }
            return i
        }
    }
    return -1
}

let a = "dafdfasdf"
let b = "fdfg"
console.log(strStr(a, b))
