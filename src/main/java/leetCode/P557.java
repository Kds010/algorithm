package leetCode;

public class P557 {
    public static void main(String[] args) {
        String C1 = "Let's take LeetCode contest";
        String C2 = "God Ding";
        String result1 = reverseWords(C1);
        String result2 = reverseWords(C2);
    }
    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        for (String word : s.split(" ")) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
