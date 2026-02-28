class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder( word1 + word2 );
        int i = 0, j = 0;
        for ( ; i < word1.length( ) && i < word2.length( ); i++ , j += 2 ) {
            result.setCharAt( j, word1.charAt( i ));
            result.setCharAt( j + 1, word2.charAt( i ));
        }

        while ( i < word1.length() )  {
            result.setCharAt( j++, word1.charAt( i++ ) );
        }

        while (i < word2.length() )  {
            result.setCharAt( j++, word2.charAt( i++ ) );
        }
        return result.toString( );
    }
}