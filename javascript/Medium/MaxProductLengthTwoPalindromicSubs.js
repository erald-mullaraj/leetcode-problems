
/**
 * @param {string} s
 * @return {number}
 */
var maxProduct = function(s){
    r = 0;
    sbsclc(s, "", "", 0);
    return r;
};

function plen(sbs){
    let sl = sbs.length;
    if(sl == 0){
        return 0;
    }
    if(sl == 1){
        return 1;
    }
    else{
        return sbs.charAt(0) == sbs.charAt(sl - 1) ? 
        plen(sbs.substring(1, sl - 1)) + 2 :
        Math.max(plen(sbs.substring(1)), plen(sbs.substring(0, sl - 1)));
    }
};

function sbsclc(s, s1, s2, i){
    if(i == s.length){
        r = Math.max(r, plen(s1) * plen(s2));
        return;
    }
    sbsclc(s, s1 + s.charAt(i), s2, i + 1);
    sbsclc(s, s1, s2 + s.charAt(i), i + 1);
};

let a = "helelelreo";
console.log(maxProduct(a));
