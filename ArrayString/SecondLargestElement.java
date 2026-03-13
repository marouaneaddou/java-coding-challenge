import java.util.Arrays;

class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort( arr );
        int size = arr.length;
        int max = arr[size - 1];
        for ( int i = size - 2; i > -1 ; i-- ) {
            if ( max > arr[ i ]) {
                max = arr[i];
                break;
            }
        }
        return max == arr[size - 1] ? -1 : max;
    }
}