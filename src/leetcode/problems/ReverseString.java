package  leetcode.problems;

public class ReverseString {


    //344. Reverse String

    /*Write a function that reverses a string. The input string is given as an array of characters s.
     You must do this by modifying the input array in-place with O(1) extra memory.


     Example 1:
     Input: s = ["h","e","l","l","o"]
     Output: ["o","l","l","e","h"]


     Example 2:
     Input: s = ["H","a","n","n","a","h"]
     Output: ["h","a","n","n","a","H"]


    */



    public static void main(String[] args) {
     char[] s = {'h','e','l','l','o'};
     
     
        reverseString(s);
        
        for (char c : s) {
            System.out.println(c);
        }
      

    }

    public static void reverseString(char[] s) {

        // Initialize two pointers: one at the start of the array and the other at the end.
        int left = 0;
        int right = s.length - 1;

        // Loop until the two pointers meet in the middle.
        while (left < right) {

            // Swap the characters at the 'left' and 'right' pointers.
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the 'left' pointer one step forward.
            left++;

            // Move the 'right' pointer one step backward.
            right--;
        }

        // The array 's' is now reversed in-place.
    }
    
    
  
    
    
}
