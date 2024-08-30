package Medium;

public class PushDominoes {
    public static void main(String[] args){
        String dominoes = ".R..LLRR..R....";
        String dominoes2 = ".L.R...LR..L..";
        System.out.println(dominoes);
        System.out.println(pushDominoes(dominoes));
        System.out.println(dominoes2);
        System.out.println(pushDominoes(dominoes2));
    }

    public static String pushDominoes(String dominoes) {
        int l = dominoes.length();
        if(l == 1) return dominoes;
        char[] d = dominoes.toCharArray(); 
        int i = 0;
        while(i < l){
            if(d[i] == '.'){
                if(i == 0){
                    int j = 0;
                    while(j < l && d[j] == '.'){
                        j++;
                    }
                    if(j < l){
                        if(d[j] == 'L'){
                            while(i <= j){
                                d[i] = d[j];
                                i++;
                            }
                            i--;
                        } else {
                            i = j;
                        }
                    }
                }
                else {
                    int j = i;
                    while(j < l && d[j] == '.'){
                        j++;
                    }
                    if(j < l){
                        if(d[j] == d[i - 1]){
                            while(i <= j){
                                d[i] = d[j];
                                i++;
                            }
                            i--;
                        } if (d[i - 1] == 'R') {
                            if(d[j] == 'L'){
                                int m = (i + j)/2;
                                int mid = (i + j)%2;
                                while(i < m){
                                    d[i] = 'R';
                                    i++;
                                }
                                i += mid;
                                while(i < j){
                                    d[i] = 'L';
                                    i++;
                                }
                                i--;
                            }
   
                        }
                    }
                    else {
                        if(d[i - 1] == 'R'){
                            while(i < j){
                                d[i] = 'R';
                                i++;
                            }
                        }
                        
                    }
                }
            }
            i++;
        }
        String r = String.valueOf(d);
        return r;
    }
}
