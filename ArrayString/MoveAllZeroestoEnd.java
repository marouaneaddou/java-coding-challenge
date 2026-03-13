class Solution {
    void pushZerosToEnd(int[] arr) {
        int i = 0, count = 0;
        for ( ; i < arr.length ; i++) {
            if ( arr[i] != 0 ) arr[count++] = arr[i];
        }
        while ( count < arr.length ) arr[count++] = 0;
    }
}