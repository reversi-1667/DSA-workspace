public class ValidParentheses {
    public boolean isValid(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses obj = new ValidParentheses();

        String input1 = "()[]{}";
        String input2 = "(]";
        String input3 = "([{}])";

        System.out.println("Input: " + input1 + " -> " + obj.isValid(input1));
        System.out.println("Input: " + input2 + " -> " + obj.isValid(input2));
        System.out.println("Input: " + input3 + " -> " + obj.isValid(input3));
    }
}

