import jdk.nashorn.internal.ir.annotations.Immutable;

import java.lang.annotation.Annotation;
import java.util.*;

/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class NumberCombos implements Immutable {

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


    protected void getUserEnteredCombo(String userInput) throws NotEnoughDigitsException, TooManyDigitsException, DigitsNotUniqueException {
        List<Integer> guessList = new ArrayList<>();
        String parsedUsersString = parseDigitString(userInput);
        char[] usersInputChar = parsedUsersString.toCharArray();
        for (char singleChar : usersInputChar) {
            guessList.add(Character.getNumericValue(singleChar));
        }
        if (guessList.size() < numberCount) throw new NotEnoughDigitsException();
        if (guessList.size() > numberCount) throw new TooManyDigitsException();
        if (!areDigitsUnique(guessList)) throw new DigitsNotUniqueException();
        numberCombination = guessList;
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


    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
