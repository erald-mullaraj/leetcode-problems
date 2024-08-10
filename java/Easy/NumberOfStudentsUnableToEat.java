package Easy;

public class NumberOfStudentsUnableToEat {
    public static void main(String[] args){
        int[] students = {1,1,1,0,0,1};
        int[] sandwitches = {1,0,0,0,1,1};
        System.out.println(countStudents(students, sandwitches));
    }

    public static int countStudents(int[] students, int[] sandwiches) {
        int[] f = new int[2];
        for(int i = 0; i < students.length; i++){
            f[students[i]]++;
        }
        for(int i = 0; i < sandwiches.length; i++){
            if(f[sandwiches[i]] == 0){
                return sandwiches.length - i;
            } else {
                f[sandwiches[i]]--;
            }
        }
        return 0;
    }
}
