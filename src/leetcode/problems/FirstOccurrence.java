package leetcode.problems;

public class FirstOccurrence {
    
    // 28. Find the Index of the First Occurrence in a String
    
    /*
    Given two strings needle and haystack,
    return the index of the first occurrence of needle in haystack, 
    or -1 if needle is not part of haystack.
    
    
    Example:
    
    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    
    Explanation: "sad" occurs at index 0 and 6.
    The first occurrence is at index 0, so we return 0.

    
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
    Explanation: "leeto" did not occur in "leetcode", so we return -1.
    
    
    
    */
    
    
    
    public static void main(String[] args) {

        System.out.println(strStr("leetcode", "leet"));

    }

 public static int strStr(String haystack, String needle) {
        
    // Convert both haystack and needle to lowercase to make the search case-insensitive
    String lowerHayStack = haystack.toLowerCase();
    String lowerNeedle = needle.toLowerCase();

    // Get the lengths of both the haystack and the needle strings
    int lowerHayStackSize = lowerHayStack.length();
    int lowerNeedleSize = lowerNeedle.length();

    // Check if the haystack contains the needle at all
    if (lowerHayStack.contains(lowerNeedle)) {

        // Special case: If the needle is an empty string, return 0
        if (lowerNeedleSize == 0) {
            return 0;
        }

        // Loop through the haystack string
        for (int i = 0; i < lowerHayStackSize; i++) {

            // Check if the character at the current index matches the first character of the needle
            if (lowerHayStack.charAt(i) == lowerNeedle.charAt(0)) {
                
                // Create a StringBuilder to build the substring dynamically
                StringBuilder test = new StringBuilder();

                // Loop to build the substring starting from the current index in the haystack
                // This will build a substring of length equal to the needle
                for (int j = i; j < lowerNeedleSize + i; j++) {
                    test.append(lowerHayStack.charAt(j)); // Append characters to the StringBuilder
                }

                // After building the substring, check if it matches the needle
                if (test.toString().equals(lowerNeedle)) {
                    return i; // If they match, return the starting index
                }
            }
        }
    }

    // If the needle is not found, return -1
    return -1;
    }

}
