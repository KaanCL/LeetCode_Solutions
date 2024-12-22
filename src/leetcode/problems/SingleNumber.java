
package leetcode.problems;

public class SingleNumber {
    
    //136. Single Number
    
    /*
    Given a non-empty array of integers nums, 
    every element appears twice except for one. 
    Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.
    
    Example :

    Input: nums = [2,2,1]
    Output: 1

    Input: nums = [4,1,2,1,2]
    Output: 4
      
    */

    public static void main(String[] args) {
        
      
        
        int nums[] = { 1,2,1,3,2};
        
        
        System.out.println("singleNum->"+singleNumber(nums));
        
    }
    
    public static int singleNumber(int[] nums){
   
        
        // Initialize a variable to store the result, starting with 0
        int singleNum = 0;

        // Iterate over each element in the array
        for (int num : nums) {
            // Apply XOR operation between the current number and the result
            singleNum = num ^ singleNum;
        }

        // Return the result, which is the single number
        return singleNum;
    }
    
}

/* 
0^1 = 0000 ^ 0001 = 0001
2^1 = 0010 ^ 0001 = 0011
1^3 = 0001 ^ 0011 = 0010
3^2 = 0011 ^ 0010 = 0001
2^1 = 0010 ^ 0001 = 0011


*/
