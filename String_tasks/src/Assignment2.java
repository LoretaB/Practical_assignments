import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Assignment2 {


    public static int wordCounter(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                counter++;
            }
        }
        return counter;
    }

    public static int findThe(String str, String pattern) {
        Pattern myPattern = Pattern.compile(pattern);
        Matcher matcher = myPattern.matcher(str);
        int counter = 0;
            while (matcher.find()) {
                counter++;
            }
        return counter;
    }

    public static int findS(String str, String pattern) {
        Pattern myPattern = Pattern.compile(pattern);
        Matcher matcher = myPattern.matcher(str);
        int counter = 0;
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static void repeatingWords(String str) {
        String words[]=str.split(" |,");
        System.out.println("Dublicate words are: ");
        for (int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                    System.out.println(words[i]);
                }
            }
        }
    }

    public static void replaceWord(String str, String pattern, String replacementWord) {
        System.out.println(str.replaceAll(pattern,replacementWord));
    }

    public static void main(String[] args) {
      String myString = "Climb mountains not so the world can see you, but so you can see the world";
      System.out.println("There are " + (wordCounter(myString) + 1) + " words in the sentence!");
      System.out.println("There are " + findThe(myString, "\\bthe\\b") + " (the) words in the sentence!");
      System.out.println(findS(myString, "s+") + " words in the sentence contains letter s!");
      repeatingWords(myString);
      replaceWord(myString,"you", "You");
    }
}
