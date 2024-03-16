package Easy;

import java.util.Stack;

public class BaseballGame {
    
    public static void main(String[] args){

        String[] c = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(c));
         
    }
    public static int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        int sc = 0;
        for (String op : operations){
            if(op.equals("+")) {
                st.push(st.lastElement()+st.get(st.size()-2));
            }
            else if(op.equals("D")){
                st.push(st.lastElement()*2);
            }
            else if(op.equals("C")){
                st.pop();
            } else {
                st.push(Integer.parseInt(op));
            }
            System.out.println(st);
        }
        while(!st.isEmpty()){
            sc += st.pop();
        }
        return sc;
    }   
}
