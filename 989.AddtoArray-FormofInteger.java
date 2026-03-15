import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        for ( int i = num.length - 1; i > -1 || k != 0; i-- ) {
            if ( i > -1 ) {
                k += num[i];
            }
            result.add(0, k % 10);
            k /= 10;
        }
        return result;
    }
    // public List<Integer> addToArrayForm(int[] num, int k) {
    //     StringBuffer snum = new StringBuffer();
    //     StringBuffer sk = new StringBuffer();
    //     for ( int i = 0; i < num.length ; i++ ) {
    //         snum.append( (char)(num[i] + '0') ); 
    //     }
    //     while( k != 0 ) {
    //         sk.insert( 0, (char)((k % 10) + '0') );
    //         k /= 10;
    //     }
    //     int skSize = sk.length(), snSize = snum.length(), i;
    //     if ( skSize < snSize ) {
    //         for ( i = skSize; i < snSize; i++ ) sk.insert( 0, '0' );
    //     }
    //     else {
    //         for ( i = snSize; i < skSize; i++ ) snum.insert( 0, '0' );
    //     }
    //     // System.out.printf("%s %s\n", snum, sk);
    //     List<Integer> result = new LinkedList<>();
    //     int sum = 0;
    //     for ( i = snum.length() - 1 ; i > -1; i-- ) {
    //         sum = (int)( snum.charAt(i) - '0') + (int)(sk.charAt(i) - '0' ) + sum;
    //         // System.out.printf("%d %d\n", sum, i);
    //         if ( sum >= 10 ) {
    //             result.addFirst( sum % 10 );
    //             sum /= 10;
    //         }
    //         else {
    //             result.addFirst( sum );
    //             sum = 0;
    //         }
    //     }
    //     if ( sum != 0 ) result.addFirst( sum );
    //     return result;
    // }
}