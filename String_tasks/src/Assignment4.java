import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment4 {
    enum Suits {
        SPADES, CLUBS, HEARTS, DIAMONDS
    }

    enum CardValues {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }


    public static String[] cardPackMaker(String[] cardPack) {
        Suits[] suitsArr = Suits.values();
        CardValues[] cardValuesArr = CardValues.values();
        int i = 0;
        while (i < cardPack.length) {
            for (Suits suit : suitsArr) {
                for (CardValues card : cardValuesArr) {
                    cardPack[i] = suit.toString() + " " + card.toString();
                    i++;
                }
            }
        }
        return cardPack;
    }

    public static String[] shuffle(String[] cardPackArr) {
        List<String> cardPackList = Arrays.asList(cardPackArr);
        Collections.shuffle(cardPackList);
        cardPackArr = cardPackList.toArray(new String[cardPackList.size()]);
        return cardPackArr;
    }

    public static String[] remove(String[] arr, int cardCountToRemove) {
        String[] afterRemovingArray = new String[arr.length - cardCountToRemove];
        String[] removedCards = new String[cardCountToRemove];
        for (int i = 0, j = 0, k = 0; i < arr.length; i++) {
            if (i < cardCountToRemove) {
                removedCards[k++] = arr[i];
                continue;
            }
            afterRemovingArray[j++] = arr[i];
        }
        System.out.println(Arrays.toString(removedCards));
        return afterRemovingArray;
    }


    public static void main(String[] args) {

        String[] cardPack = new String[52];
        System.out.println("Shuffled card pack: ");
        System.out.println(Arrays.toString(shuffle(cardPackMaker(cardPack))));
        System.out.println();
        System.out.println("Select the first card and print it out in the console and remove card from card pack. Print card pack which is left.");
        String[] afterRemovingArray = remove(cardPack, 1);
        System.out.println(Arrays.toString(afterRemovingArray));
        System.out.println();
        System.out.println("Select another six cards and print all six cards in the console. Print card pack which is left.");
        String[] afterRemovingSixCards = remove(afterRemovingArray, 6);
        System.out.println(Arrays.toString(afterRemovingSixCards));


    }
}
