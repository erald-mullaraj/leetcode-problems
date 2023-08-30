import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args){
        String[] emails = {"test.email+alex@leetcode.com",
        "test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {

        Set<String> s = new HashSet<>();

        for(String str : emails){
            String[] str1 = str.split("@");
            String st = new String();
            for(int j = 0; j<str1[0].length();j++){
                if(str.charAt(j) == '+'){
                    break;
                }
                else if(str.charAt(j) == '.'){
                   continue;
                } else {
                    st = st + str.charAt(j);
                }
            }
            st = st + "@" + str1[1];
            s.add(st);
        }
        System.out.println(s);
        return s.size();
    }
    
}