import java.util.*;

/**
 * Created by Roman on 2017.06.01..
 */

public class CowsAndBulls {
    private Scanner scanner = new Scanner(System.in);
    List<Integer> numbersToBeGuessed = new ArrayList<Integer>();


    void fillNumbersToBeGuessed() {
        Random rand = new Random();
        while (numbersToBeGuessed.size() < 4) {
            int a = rand.nextInt(10);
            if (!numbersToBeGuessed.contains(a)) {
                numbersToBeGuessed.add(a);
            }
        }
    }

    List<Integer> getGuesses() {
        List<Integer> guessList = new ArrayList<Integer>();
        System.out.println("Please enter 4 unique digits (0-9) to guess numbers and positions:");
        while (guessList.size() < 4) {
            String enteredText = scanner.nextLine();
            String enteredNumbersAsString = enteredText.replaceAll("[\\D]", "");
            if (enteredNumbersAsString.length() < 4) {
                System.out.println("You have entered less than 4 digits, lets try again");
            } else if (enteredNumbersAsString.length() > 4) {
                System.out.println("You have entered more than 4 digits, lets try again");
            } else {
                char[] digitsInCharArray = enteredNumbersAsString.toCharArray();
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

    public boolean countCowsAndBulls(List<Integer> guesses) {
        boolean isAllGuessed = false;
        int Cows = 0;
        int Bulls = 0;
        for (int i = 0; i < 4; i++) {
            if (numbersToBeGuessed.contains(guesses.get(i))) {
                Cows++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (numbersToBeGuessed.get(i).equals(guesses.get(i))){
                Cows--;
                Bulls++;
            }
        }
        if (Bulls == 4) {
            isAllGuessed = true;
            System.out.println("Congratulations, you have 4 Bulls and correctly guessed all numbers!");
        } else {
            System.out.println("with this try you have: Cows - " + Cows + " Bulls - " + Bulls);
        }
        return isAllGuessed;
    }

}
