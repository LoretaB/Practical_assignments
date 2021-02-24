import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

public class Task2 {


    public static boolean isPalindromeStackMethod(String sentence) {
        Stack<Character> stack1 = new Stack<>();
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < newSentence.length(); i++) {
            stack1.push(newSentence.toLowerCase(Locale.ROOT).charAt(i));
        }
        String reverseString = "";
        while (!stack1.isEmpty()) {
            reverseString = reverseString + stack1.pop();
        }
        if (newSentence.toLowerCase(Locale.ROOT).equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeArrayBlockingQueueMethod(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        ArrayBlockingQueue<Character> queue = new ArrayBlockingQueue<Character>(newSentence.length());
        for (int i = newSentence.length() - 1; i >= 0; i--) {
            queue.add(newSentence.toLowerCase(Locale.ROOT).charAt(i));
        }
        String reverseString = "";

        Iterator iteratorChars = queue.iterator();
        while (iteratorChars.hasNext()) {
            reverseString = reverseString + iteratorChars.next();
        }
        if (newSentence.toLowerCase(Locale.ROOT).equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPalindromeArrayDeque(String sentence) {
        String newSentence = sentence.replaceAll("[^a-zA-Z]", "");
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < newSentence.length(); i++) {
            queue.add(newSentence.toLowerCase(Locale.ROOT).charAt(i));
        }
        String reverseString = "";

        Iterator iteratorChars = queue.descendingIterator();
        while (iteratorChars.hasNext()) {
            reverseString = reverseString + iteratorChars.next();
        }
        if (newSentence.toLowerCase(Locale.ROOT).equals(reverseString)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String a = "Mom";
        String b = "Was it a car or a cat I saw?";
        String c = "Madam, in Eden, I’m Adam.";
        String d = "Yo, banana boy!";
        System.out.format("Is this sentence %s palindrome? Answer: " + isPalindromeStackMethod(a) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeStackMethod(b) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeStackMethod(c) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeStackMethod(d) +
                "\n", a, b, c, d);
        System.out.println();
        System.out.format("Is this sentence %s palindrome? Answer: " + isPalindromeArrayBlockingQueueMethod(a) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayBlockingQueueMethod(b) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayBlockingQueueMethod(c) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayBlockingQueueMethod(d) +
                "\n", a, b, c, d);
        System.out.println();
        System.out.format("Is this sentence %s palindrome? Answer: " + isPalindromeArrayDeque(a) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayDeque(b) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayDeque(c) +
                "\nIs this sentence %s palindrome? Answer: " + isPalindromeArrayDeque(d) +
                "\n", a, b, c, d);

    }
}


