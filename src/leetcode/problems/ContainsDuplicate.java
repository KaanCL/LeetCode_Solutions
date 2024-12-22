
package leetcode.problems;
import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    // 217. Contains Duplicate
    
    /*
    Given an integer array nums,
    return true if any value appears 
    at least twice in the array, and return false if every element is distinct.
    
    Example:

    Input: nums = [1,2,3,1]

    Output: true

    Explanation:

    The element 1 occurs at the indices 0 and 3.
    
    
    */
    
    public static void main(String[] args) {
        
        int nums[] = {1,3,4,2,1};
        
 

       
        System.out.println(containsDuplicate(nums));
        
        
    }
    
    
    public static boolean containsDuplicate(int[] nums){
        
   
        // Using a HashSet to store unique elements from the array
        HashSet<Integer> nums2 = new HashSet<>();

        // Getting the length of the input array
        int n = nums.length;

        // Looping through all elements of the array
        for (int i = 0; i < n; i++) { 
            nums2.add(nums[i]); // Adding each element to the HashSet
        }

        // Comparing the size of the HashSet with the length of the array
        // If sizes are different, duplicates exist
        if (nums.length != nums2.size()) {
            return true; // Return true if duplicates are found
        }

        // If sizes are equal, there are no duplicates
        return false;
    }
    
}
