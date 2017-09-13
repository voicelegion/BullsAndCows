/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class ComboComparator {
    public static Result compareCombinations(NumberCombos generatedCombo, NumberCombos usersCombo) {
        Result result = new Result();
        for (int i = 0; i < 4; i++) {
            if (generatedCombo.numberCombination.contains(usersCombo.numberCombination.get(i))) {
                result.setCows(result.getCows() + 1);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (generatedCombo.numberCombination.get(i).equals(usersCombo.numberCombination.get(i))) {
                result.setCows(result.getCows() - 1);
                result.setBulls((result.getBulls() + 1));
            }
        }
        if (result.getBulls() == 4) {
            System.out.println("Congratulations, you have 4 Bulls and correctly guessed all numbers!");
        } else {
            System.out.println("With this try you have: Cows - " + result.getCows() + " Bulls - " + result.getBulls());
        }
        return result;
    }
}
