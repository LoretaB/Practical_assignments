import java.util.Locale;

public class Assignment5 {

    public static boolean isPalindrome(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        String reverseSentence = reverse(sentence).toLowerCase(Locale.ROOT);
        if (reverseSentence.equals(newSentence.toLowerCase(Locale.ROOT))) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        char[] charSentence = newSentence.toCharArray();
        char[] charSentenceReversed = new char[newSentence.length()];
        for (int i = charSentence.length - 1, j = 0; i >= 0; i--) {
            charSentenceReversed[j++] = charSentence[i];
        }

        return String.valueOf(charSentenceReversed);
    }

    public static void main(String[] args) {
        String a = "Mom";
        String b = "Was it a car or a cat I saw?";
        String c = "Madam, in Eden, I’m Adam.";
        String d = "Yo, banana boy!";
        System.out.format("Is this sentence %s palindrome? Answer: " + isPalindrome(a) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindrome(b) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindrome(c) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindrome(d) +
                "\n", a, b, c, d);
    }
}

