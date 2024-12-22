package leetcode.problems;


public class PalindromeNumber {
    
    // 9. Palindrome Number
    
    /*
    Given an integer x, return true if x is a palindrome, and false otherwise.
    
    Example:
    
    Input: x = 121
    Output: true
   
    Explanation: 121 reads as 121 from left to right and from right to left.
    
    Input: x = -121
    Output: false
    
    Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
   

    */
    
    
    public static void main(String[] args) {
        
        System.out.println(isPalindrome(-121));
        
    }
    
    
    public static boolean isPalindrome(int number){
        
    // Convert the number to a string.
    String numberStr = number + "";
    
    // Get the length of the string representation of the number.
    int n = numberStr.length();
    
    // Initialize an empty string to store the reversed version of the number.
    String reverseStr = "";

    // Loop through the string from the end to the beginning and build the reversed string.
    for (int i = n - 1; i >= 0; i--) {
        reverseStr += numberStr.charAt(i); // Add each character to reverseStr.
    }

    // Compare the original string with the reversed string.
    // If they are the same, return true (the number is a palindrome).
    // Otherwise, return false.
    return numberStr.equals(reverseStr) ? true : false;
    }
            
    
}


