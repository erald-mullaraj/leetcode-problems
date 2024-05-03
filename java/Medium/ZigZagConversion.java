package Medium;

public class ZigZagConversion {

    public static void main(String[] args){
        String a = "PAYPALISHIRING";
        String p = convert(a, 3);
        System.out.println(p);
        String p2 = convert2(a, 3);
        System.out.println(p2);
    }
    
    public static String convert(String s, int numRows){
        if(numRows == 1) return s;
        int l = s.length();
        if( l <= numRows) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder("");
        }
        int i = 0;
        int r = 0;
        while(i < l){
            while(r < numRows && i < l){
                sb[r].append(s.charAt(i));
                r++;
                i++;
            }
            r--;
            while(r > 0 && i < l){
                r--;
                sb[r].append(s.charAt(i));
                i++;
            }
            r++;
        }
        int j = 1;
        while(j < numRows){
            
            sb[0].append(sb[j]);
            j++;
        }  
        return sb[0].toString();
    }

    public static String convert2(String s, int numRows){
        if(numRows == 1) return s;
        int l = s.length();
        if( l <= numRows) return s;
        if (numRows == 2) {
            char[] zArr = new char[l];
			int zi = 0;
			int i = 0;
			while (i < l) {
				zArr[zi++] = s.charAt(i);
				i += 2;
			}
			i = 1;
			while (i < l) {
				zArr[zi++] = s.charAt(i);
				i += 2;
			}
			String res = new String(zArr);
			return res;
        }
        char[] zArr = new char[l];
        int i = 0;
        int r = 0;
        int repeat = 2 * numRows - 2;
        while(r < numRows){
            int i2 = r;
            int n = repeat - r;
            while(i2 < l){
                zArr[i++] = s.charAt(i2);
                i2 += repeat;
                if(r != 0 && r != numRows - 1 && n < l){
                    zArr[i++] = s.charAt(n);
                    n += repeat;
                }
            }
            r++;
        }
        return new String(zArr);
    }
}