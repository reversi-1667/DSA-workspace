public class IsSubsequenceChecker {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s.length();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String t1 = "ahbgdc";

        String s2 = "axc";
        String t2 = "ahbgdc";

        System.out.println("Example 1: " + isSubsequence(s1, t1)); // true
        System.out.println("Example 2: " + isSubsequence(s2, t2)); // false
    }
}

