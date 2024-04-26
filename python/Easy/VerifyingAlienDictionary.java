package Easy;

public class VerifyingAlienDictionary {

    public static void main(String[] args){
        String[] s = {"a","c","d"};
        String[] s1 = {"fxasxpc","dfbdrifhp","nwzgs","cmwqriv","ebulyfyve","miracx","sxckdwzv","dtijzluhts","wwbmnge","qmjwymmyox"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        String order1 = "zkgwaverfimqxbnctdplsjyohu";
        System.out.println(isAlienSorted(s, order));
        System.out.println(isAlienSorted(s1, order1));
        
    }
    
    public static boolean isAlienSorted(String[] words, String order){
        
        for(int i = 0; i < words.length - 1; i++){
            int l = words[i].length() < words[i + 1].length() ? words[i].length() : words[i + 1].length();
            int l2 = l;
            for(int j = 0; j < l; j++){
                if(order.indexOf(words[i].charAt(j)) < order.indexOf(words[i + 1].charAt(j))){
                    break;
                } else if (order.indexOf(words[i].charAt(j)) > order.indexOf(words[i + 1].charAt(j))){
                    return false;
                } else {
                    l2--;
                }
            }
            if(l2 == 0 && words[i].length() > words[i + 1].length()){
                return false;
            }
        }
        return true;
    }
}
