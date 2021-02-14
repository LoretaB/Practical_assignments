public class Assignment1 {

        public static void charCheckStartEnd(String[] arr, char charStart, char charEnd) {
            int counterStart = 0;
            int counterEnd=0;
            for (String str : arr) {
                if (str.charAt(0) == charStart) {
                    counterStart++;
                }
                if (str.charAt(str.length() - 1) == charEnd) {
                    counterEnd++;
                }
            }
            System.out.format("There are %d values starting with C and %d values ending with e!",counterStart, counterEnd);

        }

        public static int checkLength(String[] arr, int intToCheck) {
            int counter = 0;
            for (String str : arr) {
                if (str.length() == intToCheck) {
                    counter++;
                }
            }
            return counter;
        }

        public static void checkContaining(String[] arr, String stringToCheck, String subStringCheck) {
            int stringCounter = 0;
            boolean hasSubstring=false;
            for (String str : arr) {
                if (str.contains(stringToCheck)) {
                    stringCounter++;
                }
                if(str.contains(subStringCheck)){
                 hasSubstring=true;
                }
            }
            System.out.format("There are %d values, that contains e",stringCounter);
            System.out.println();
            System.out.println("Is there any element which contain subString te? Answer: "+hasSubstring);
        }

        public static void histogram(String[] arr) {
            int[] blankArr = new int[15];
            for (int i = 0; i < blankArr.length; i++) {
                int counter = 0;
                for (String str : arr) {
                    if (i == str.length()) {
                        counter++;
                    }
                }
                blankArr[i] = counter;
                if(counter!=0){
                    System.out.println(i + " elements contain " + blankArr[i] + " values");
                }
            }
        }

        public static void main(String[] args) {
            String[] stringArray = new String[]{"Computer", "Plate", "Chair", "Girl", "Boy", "Cat", "Dog", "Shirt", "Determination"};

            charCheckStartEnd(stringArray,'C', 'e');
            System.out.println();
            System.out.println("There are " + checkLength(stringArray, 5) + " values, that are 5 elements long!");
            checkContaining(stringArray,"e", "te");
            System.out.println("Histogram:");
            histogram(stringArray);
        }

    }

