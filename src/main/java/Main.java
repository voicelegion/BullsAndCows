import java.util.List;
import java.util.Scanner;

/**
 * Created by Roman on 2017.06.01..
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws TooManyDigitsException, NotEnoughDigitsException, DigitsNotUniqueException {
        NumberCombos generatedCombo = new NumberCombos();
        generatedCombo.numberCombination = NumberCombos.generateCombo();
        NumberCombos usersCombo = new NumberCombos();
        String welcomeMSG = "Welcome to Cows and Bulls game. Please enter 4 unique digits to guess the magic number";
        System.out.println(welcomeMSG);
       for ( int i = CowsAndBulls.getMaxTries(); i > 0; i--) {
            try {
                usersCombo.getUserEnteredCombo(scanner.nextLine());
            } catch (TooManyDigitsException e) {
                String errorTooManyDigits = "You have entered more than 4 digits.Please try again";
                System.out.println(errorTooManyDigits);
                i++;
                continue;
            } catch (NotEnoughDigitsException e) {
                String errorNotEnoughDigits = "You have entered less than 4 digits.Please try again";
                System.out.println(errorNotEnoughDigits);
                i++;
                continue;
            } catch (DigitsNotUniqueException e) {
                String errorNotUniqueDigits = "You have entered not unique 4 digits.Please try again";
                System.out.println(errorNotUniqueDigits);
                i++;
                continue;
            }
            Result result =ComboComparator.compareCombinations(generatedCombo, usersCombo);
            CowsAndBulls.setCounter(CowsAndBulls.getCounter()+1);
            if (result.getBulls()!=4) {
                System.out.println("You have " + (CowsAndBulls.getMaxTries() - CowsAndBulls.getCounter()) + " tries left");
            } else break;
        }
    }
}
