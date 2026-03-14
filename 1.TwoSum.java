import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elem = new HashMap<Integer, Integer>();
        for ( int i = 0; i < nums.length; i++ ) elem.put( nums[i], i);
        Integer idx;
        for ( int i = 0; i < nums.length; i++ ) {
            idx = elem.get( target - nums[i] );
            if ( idx != null && i != idx) return new int[]{i, idx};
        }
        return new int[]{};
    }
}