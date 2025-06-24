package leetcode.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class ThirdMaximumNumber {

    /*
    414. Third Maximum Number
    
    Given an integer array nums, return the third distinct maximum number in this array.
    If the third maximum does not exist, return the maximum number.
    
    Example:
    
    Input: nums = [2,2,3,1]
    Output: 1
    Explanation: The first distinct maximum is 3.
                 The second distinct maximum is 2.
                 The third distinct maximum is 1.
                 
    Input: nums = [1,2]
    Output: 2
    Explanation: The third distinct maximum does not exist,
                 so the maximum (2) is returned instead.
    */

    public static void main(String[] args) {

        int nums[] = {1, 2};

        System.out.println(thirdMax(nums));

    }

    public static int thirdMax(int[] nums) {

        // Create a TreeSet to store unique numbers in sorted order.
        TreeSet<Integer> numbers = new TreeSet<Integer>();

        // Add all numbers from the array into the TreeSet
        // This removes duplicates and sorts them automatically.
        for (int val : nums) {
            numbers.add(val);
        }

        // Convert the sorted set into a list for easy index-based access.
        List<Integer> list = new ArrayList<>(numbers);

        // Print the sorted distinct elements for debugging.
        System.out.println(list);

        // If there are less than 3 distinct numbers,
        // return the maximum number (the last element in the sorted set).
        if (numbers.size() < 3) {
            return numbers.last();
        }
        // Otherwise, return the third maximum distinct number.
        else {
            return list.get(list.size() - 3);
        }
    }
}
