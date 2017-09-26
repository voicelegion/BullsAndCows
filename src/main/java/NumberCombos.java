import java.util.*;

/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class NumberCombos {
    List<Integer> numberCombination = new ArrayList<Integer>();

    List<Integer> generateCombo() {
        List<Integer> numberCombination = new ArrayList<Integer>();
        Random rand = new Random();
        while (numberCombination.size() < 4) {
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

    public String checkIfStringIsValid(String stringForCheck) {
        if (stringForCheck.length() < 4) {
            return "You have entered less than 4 digits, lets try again";
        } else if (stringForCheck.length() > 4) {
            return "You have entered more than 4 digits, lets try again";
        }
        char[] digitsInCharArray = stringForCheck.toCharArray();
        List<Integer> guessList = new ArrayList<Integer>();
        for (char oneChar : digitsInCharArray) {
            guessList.add(Character.getNumericValue(oneChar));
        }
        if (!areDigitsUnique(guessList)) {
            return "You have entered not unique digits, please try again";
        } else {
            numberCombination = guessList;
            return "Great, your answer is accepted. Lets see how many Bulls and Cows you got! \n Your numbers: " + guessList;
        }
    }

    public boolean areDigitsUnique(List<Integer> digitList) {
        Set<Integer> someSet = new HashSet<Integer>();
        boolean result = true;
        for (Integer digit : digitList) {
            result = someSet.add(digit);
            if (!result) break;
        }
        return result;
    }


}
