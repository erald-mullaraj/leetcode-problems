package Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        Map<Character, Character> m = new HashMap<Character, Character>() {{
            put(')', '(');
            put('}', '{');
            put(']', '[');
        }};

        for (int i = 0; i < s.length();i++){
            if(m.containsKey(s.charAt(i))) {
                if(!st.isEmpty() && st.get(st.size()-1) == m.get(s.charAt(i))){
                    st.pop();
                } else {
                    return false;
                }
            } else {
                st.push(s.charAt(i));
            }
        }
        if (st.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
