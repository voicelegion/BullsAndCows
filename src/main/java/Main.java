/**
 * Created by Roman on 2017.06.01..
 */
public class Main {

    public static void main(String[] args) throws TooManyDigitsException, NotEnoughDigitsException, DigitsNotUniqueException {
        NumberCombos numberCombos = new NumberCombos();
        numberCombos.parseDigitString("Hello");
        numberCombos.getUserEnteredCombo(numberCombos.parseDigitString("1234"));
        System.out.println(numberCombos.numberCombination);

    }
}
