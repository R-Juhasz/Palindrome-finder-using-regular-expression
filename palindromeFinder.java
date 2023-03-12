import java.util.*;

public class palindromeFinder {
    public static void main(String[] args) {
        String[] strings = {"racecar", "no lemon, no melon", "deified", "level", "hello world"};

        Set<String> palindromes = new HashSet<>();
        for (String s : strings) {
            String input = s.toLowerCase().replaceAll("[^a-z]", "");
            if (isPalindrome(input)) {
                palindromes.add(input);
            }
        }

        List<String> sortedPalindromes = new ArrayList<>(palindromes);
        Collections.sort(sortedPalindromes);

        System.out.println("Palindromes found:");
        for (String palindrome : sortedPalindromes) {
            System.out.println(palindrome);
        }
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
