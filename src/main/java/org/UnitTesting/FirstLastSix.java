package org.UnitTesting;
public class FirstLastSix {
    public boolean firstLastSix(int[] nums) {
        if(nums[0] == 6 || nums[nums.length-1] == 6){ // checks if the first index is equal to 6
            // also checks if the last index [nums.length - 1] is equal to 6
            return true;
        }
        return false;
    }


// given array of ints
// argument will be true if 6 appears as either the FIRST or LAST element in array of ints
// array will be length 1 or more
}