/**
 * Created by roman.pipchenko on 9/13/2017.
 */
public class ComboComparator {
    public static Result compareCombinations(NumberCombos generatedCombo, NumberCombos usersCombo) {
        Result result = new Result();
        for (int i = 0; i < NumberCombos.getNumberCount(); i++) {
            if (generatedCombo.numberCombination.contains(usersCombo.numberCombination.get(i))) {
                result.setCows(result.getCows() + 1);
            }
        }
        for (int i = 0; i < NumberCombos.getNumberCount(); i++) {
            if (generatedCombo.numberCombination.get(i).equals(usersCombo.numberCombination.get(i))) {
                result.setCows(result.getCows() - 1);
                result.setBulls((result.getBulls() + 1));
            }
        }
        if (result.getBulls() == NumberCombos.getNumberCount()) {
            System.out.println("Congratulations, you have "+NumberCombos.getNumberCount()+" Bulls and correctly guessed all numbers!");
        } else {
            System.out.println("With this try you have: Cows - " + result.getCows() + " Bulls - " + result.getBulls());
        }
        return result;
    }
}
