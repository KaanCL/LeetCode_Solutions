
package leetcode.problems;

import java.util.Stack;


public class ValidParentheses {
    
    // 20. Valid Parentheses
    
    /*
  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
  determine if the input string is valid.
    
  An input string is valid if:
    
  1.Open brackets must be closed by the same type of brackets.
  2.Open brackets must be closed in the correct order.
  3.Every close bracket has a corresponding open bracket of the same type.
    
 Example :

 Input: s = "()"
 Output: true

 Input: s = "()[]{}"
 Output: true
    
    */
    
    
    public static void main(String[] args) {
        
        System.out.println(isValid("()[]{}"));
        
    }
    
    
     public static boolean isValid(String s) {
    // Initialize a stack to keep track of opening brackets.
    Stack<Character> stack = new Stack<>();

    // Find the length of the string.
    int n = s.length();

    // Iterate through each character in the string.
    for (int i = 0; i < n; i++) {
        char k = s.charAt(i);

        // If the character is an opening bracket, push it onto the stack.
        if (k == '(' || k == '{' || k == '[') {
            stack.push(k);

        // If the character is a closing bracket:
        } else if (k == ')' || k == '}' || k == ']') {
            
            // Check for invalid scenarios:
            // 1. If the string has only one character (invalid for brackets).
            // 2. If the stack is empty (no corresponding opening bracket).
            // 3. If the top of the stack doesn't match the current closing bracket.
            if (n == 1 || stack.isEmpty() || !compareCharacter(stack.pop(), k)) {
                return false; // The string is invalid.
            }
        }
    }

    // If the stack is empty after processing all characters, the string is valid.
    return stack.isEmpty();
}

// Helper method to compare matching pairs of brackets.
public static boolean compareCharacter(char k1, char k2) {
    // Check if the two characters are a valid pair of brackets.
    if ((k1 == '(' && k2 == ')') || 
        (k1 == '{' && k2 == '}') || 
        (k1 == '[' && k2 == ']')) {
        return true;
    }
    return false;
    }

    
}
