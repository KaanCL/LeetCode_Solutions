
package leetcode.problems;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class MajorityElement {
    
    
   //169. Majority Element
    
    /*
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.
    
    Example:
    
    Input: nums = [3,2,3]
    Output: 3
    
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
    
    
    */
    
    
    public static void main(String[] args) {
        
        int[] nums = {3,3,4};
       
        System.out.println(majorityElement(nums));
    }
    
    public static int majorityElement(int[] nums){
      // Create a HashMap to store each element and its frequency in the array.
    HashMap<Integer, Integer> numList = new HashMap<>();
    
    // Calculate the size of the array.
    int n = nums.length;
    
    // Compute half of the array's length. The majority element must appear more than this value.
    double half = Math.ceil(n / 2); // Note: This calculation may not work as expected; explained below.
    
    // Variable to store the result (majority element).
    int result = 0;

    // Loop through each number in the array.
    for (int num : nums) {
        // Add the current number to the HashMap or increase its frequency by 1.
        numList.put(num, numList.getOrDefault(num, 0) + 1);
        
        // Check if the current number's frequency is the highest in the HashMap.
        if (numList.get(num) == Collections.max(numList.values())) {
            result = num; // Update the result to this number.
        }
    }


    // Return the result, which is the majority element.
    return result;
    }
    
}
