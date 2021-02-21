import java.util.ArrayList;

public class Task1 {


    public static void charCheckStartEnd(ArrayList<String> stringList, char charStart, char charEnd) {
        int counterStart = 0;
        int counterEnd = 0;
        for (String str : stringList) {
            if (str.charAt(0) == charStart) {
                counterStart++;
            }
            if (str.charAt(str.length() - 1) == charEnd) {
                counterEnd++;
            }
        }
        System.out.format("There are %d values starting with C and %d values ending with e!", counterStart, counterEnd);

    }

    public static int checkLength(ArrayList<String> stringList, int intToCheck) {
        int counter = 0;
        for (String str : stringList) {
            if (str.length() == intToCheck) {
                counter++;
            }
        }
        return counter;
    }

    public static void checkContaining(ArrayList<String> stringList, String stringToCheck, String subStringCheck) {
        int stringCounter = 0;
        boolean hasSubstring = false;
        for (String str : stringList) {
            if (str.contains(stringToCheck)) {
                stringCounter++;
            }
            if (str.contains(subStringCheck)) {
                hasSubstring = true;
            }
        }
        System.out.format("There are %d values, that contains e", stringCounter);
        System.out.println();
        System.out.println("Is there any element which contain subString te? Answer: " + hasSubstring);
    }

    public static void histogram(ArrayList<String> stringList) {
        int[] blankArr = new int[15];
        for (int i = 0; i < blankArr.length; i++) {
            int counter = 0;
            for (String str : stringList) {
                if (i == str.length()) {
                    counter++;
                }
            }
            blankArr[i] = counter;
            if (counter != 0) {
                System.out.println(i + " letters contain " + blankArr[i] + " words");
            }
        }
    }

    public static void quickSort(ArrayList<String> stringList, int from, int to) {

        if (from < to) {

            int divideIndex = partition(stringList, from, to);

            quickSort(stringList, from, divideIndex - 1);

            quickSort(stringList, divideIndex, to);
        }
    }

    private static int partition(ArrayList<String> stringList, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;

        char pivot = stringList.get(from + (to - from) / 2).charAt(0);
        while (leftIndex <= rightIndex) {

            while (stringList.get(leftIndex).charAt(0) < pivot) {
                leftIndex++;
            }

            while (stringList.get(rightIndex).charAt(0) > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(stringList, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private static void swap(ArrayList<String> stringList, int index1, int index2) {
        String tmp = stringList.get(index1);
        stringList.set(index1, stringList.get(index2));
        stringList.set(index2, tmp);
    }

    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Computer");
        stringList.add("Plate");
        stringList.add("Chair");
        stringList.add("Girl");
        stringList.add("Boy");
        stringList.add("Cat");
        stringList.add("Dog");
        stringList.add("Shirt");
        stringList.add("Determination");

        charCheckStartEnd(stringList, 'C', 'e');
        System.out.println();
        System.out.println("There are " + checkLength(stringList, 5) + " values, that are 5 elements long!");
        checkContaining(stringList, "e", "te");
        System.out.println("Histogram:");
        histogram(stringList);
        quickSort(stringList, 0, stringList.size()-1);
        System.out.println(stringList);
    }
}
