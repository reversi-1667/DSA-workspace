import java.util.*;
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                newStr.append(Character.toLowerCase(c));
            }
        }
        return newStr.toString().equals(newStr.reverse().toString());
    }

public static void main(String[] args)
    {
       String s= "racecar";
       boolean b= isPalindrome(s);
       if(b)
        System.out.println("palindrome");
        else
        System.out.println("not a palindrome");

    }
}
