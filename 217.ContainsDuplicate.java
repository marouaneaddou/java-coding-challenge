class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
        Integer value;
        for ( int i = 0; i < nums.length; i++ ) {
            value = freq.get( new Integer( nums[i]) );
            if ( value == null ) {
                freq.put( new Integer(nums[i]), 1 );
                continue;
            }
            freq.put( new Integer(nums[i]), value + 1 );
            if ( value == 1 ) return true;
        }
        return false;
    }
}
