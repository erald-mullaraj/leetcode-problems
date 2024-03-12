/**
 * @param {string} str1
 * @param {string} str2
 * @return {string}
 */

var gcdOfStrings = function(str1, str2) {
    if(str1 + str2 != str2 + str1){
        return "";
    } else if(str1 == str2){
        return str1;
    }
    a = str1.length;
    b = str2.length;
    var l = b < a ? b : a;
    if(a%l == 0 && b%l == 0){
        return str1.substring(0, l);
    }
    for(let i = parseInt(l/2); i > 0; i--){
        if(a%i == 0 && b%i == 0){
            return str1.substring(0, i);
        }
    }
}

var gcdOfStrings2 = function(str1, str2) {
    if (str1 + str2 != str2 + str1){
        return ""
    }
    a = str1.length;
    b = str2.length;
    while(a != b){
        if(a > b){
            a -= b;
        } else {
            b -= a;
        }
    }
    return str1.substring(0, a)
};

var s1 = "TAUXXTAUXXTAUXXTAUXXTAUXX"
var s2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"
console.log(gcdOfStrings(s1, s2))