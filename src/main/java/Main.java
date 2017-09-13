/**
 * Created by Roman on 2017.06.01..
 */
public class Main {

    public static void main(String[] args) {

        Result result;
        NumberCombos generatedCombo = new NumberCombos();
        generatedCombo.numberCombination = NumberCombos.generateCombo();
        NumberCombos usersCombo = new NumberCombos();
        usersCombo.numberCombination = usersCombo.getUserEnteredCombo();
        result = ComboComparator.compareCombinations(generatedCombo,usersCombo);
        while (result.getBulls() < 4){
            usersCombo.numberCombination = usersCombo.getUserEnteredCombo();
            result = ComboComparator.compareCombinations(generatedCombo,usersCombo);
        }

    }
}
