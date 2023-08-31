
public class IsomorphicStrings {
    public static void main(String[] args){
        String s = "fooasd";
        String t = "baavsd";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] c = new char[256];
        char[] c2 = new char[256];
        for(int i = 0; i < s.length(); i++){
            if(!Character.isLetter(c[s.charAt(i)])){
                if(c2[t.charAt(i)] == 1){
                    return false;
                }
                c[s.charAt(i)]=t.charAt(i);
                c2[t.charAt(i)]=1;
            } else {
                if (c[s.charAt(i)] != t.charAt(i)){
                    return false;
                }
                c2[t.charAt(i)] = 1;
            }
        }
        return true;
    }
}