/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[][]}
 */
var findDifference = function(nums1, nums2){
    const l1 = [];
    const l2 = [];
    let c = [];
    let j = 0;
    for(let i of nums1) c[i+1000] = 1; 
    for(let i of nums2) {
        if(c[i+1000] == 1){
            c[i+1000] = 2;
        } else if(c[i+1000] != 2) {
            l2[j++] = i; c[i+1000] = 2;
        }
    }
    j = 0;
    for(let i of nums1) if(c[i+1000] == 1) {
            l1[j++] = i; c[i+1000] = 2;
        }
    return [l1, l2];
}

var findDifference2 = function(nums1, nums2){
    const s1 = new Set(nums1);
    const s2 = new Set(nums2);
    const l1 = [...s1].filter(i => !s2.has(i))
    const l2 = [...s2].filter(i => !s1.has(i))
    return [l1, l2];
}

var findDifference3 = function(nums1, nums2){
    const l1 = new Set(nums1);
    const l2 = new Set(nums2);
    for(let i of l2) if(l1.has(i)){
           l1.delete(i);
           l2.delete(i);
        }
    return [[...l1], [...l2]];
}

let a = [1, 3, 3, 7, 4, 5];
let b = [2, 4, 6, 7, 6];
console.log(findDifference3(a, b))