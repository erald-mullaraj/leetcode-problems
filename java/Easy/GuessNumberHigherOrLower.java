package Easy;

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int min = 1;
        int max = n;
        while(true) {
            int m = min + (max - min)/2;
            int mg = guess(m);
            if(mg == 1)
                min = m + 1;
            else if(mg == -1)
                max = m - 1;
            else
                return m;
        }
    }
    
}
