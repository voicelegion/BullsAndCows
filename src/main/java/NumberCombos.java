import java.util.*;

/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class NumberCombos {

    List<Integer> numberCombination = new ArrayList<Integer>();

    public static int getNumberCount() {
        return numberCount;
    }

    public static void setNumberCount(int numberCount) {
        NumberCombos.numberCount = numberCount;
    }

    private static int numberCount = 4;
    static List<Integer> generateCombo() {
        List<Integer> numberCombination = new ArrayList<Integer>();
        Random rand = new Random();
        while (numberCombination.size() < numberCount) {
            int a = rand.nextInt(10);
            if (!numberCombination.contains(a)) {
                numberCombination.add(a);
            }
        }
        return numberCombination;
    }

         String parseDigitString(String stringForParsing) {

        return stringForParsing.replaceAll("[\\D]", "");

    }


   protected List<Integer> getUserEnteredCombo(String parsedStringFromUser) {
        List<Integer> guessList = new ArrayList<Integer>();
        System.out.println("Please enter 4 unique digits (0-9) to guess numbers and positions:");
        while (guessList.size() < numberCount) {

            if (parsedStringFromUser.length() < numberCount) {
                System.out.println("You have entered less than 4 digits, lets try again");
            } else if (parsedStringFromUser.length() > numberCount) {
                System.out.println("You have entered more than 4 digits, lets try again");
            } else {
                char[] digitsInCharArray = parsedStringFromUser.toCharArray();
                for (char oneChar : digitsInCharArray) {
                    guessList.add(Character.getNumericValue(oneChar));
                }
                if (!areDigitsUnique(guessList)) {
                    System.out.println("You have entered not unique digits, please try again");
                    guessList.clear();
                } else {
                    System.out.println("Great, your answer is accepted. Lets see how many Bulls and Cows you got");
                }
            }
        }
        System.out.println("You numbers: " + guessList);
        return guessList;
    }

    private boolean areDigitsUnique(List<Integer> digitList) {
        Set<Integer> someSet = new HashSet<Integer>();
        boolean result = true;
        for (Integer digit : digitList) {
            result = someSet.add(digit);
            if (!result) break;
        }
        return result;
    }


}
