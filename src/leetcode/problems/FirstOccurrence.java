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
        
        String lowerHayStack = haystack.toLowerCase();
        String lowerNeedle = needle.toLowerCase();

        int lowerHayStackSize = lowerHayStack.length();
        int lowerNeedleSize = lowerNeedle.length();

        if (lowerHayStack.contains(lowerNeedle)) {

            if (lowerNeedleSize == 0) {
                return 0;
            }

            for (int i = 0; i < lowerHayStackSize; i++) {

                if (lowerHayStack.charAt(i) == lowerNeedle.charAt(0)) {
                     StringBuilder test = new StringBuilder();
                    for (int j = i; j < lowerNeedleSize + i; j++) {
                         test.append(lowerHayStack.charAt(j));

                    }

                      if (test.toString().equals(lowerNeedle)) {
                             return i; }

                }

            }

        }

        return -1;
    }

}
