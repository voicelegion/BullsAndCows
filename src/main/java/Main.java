/**
 * Created by Roman on 2017.06.01..
 */
public class Main {

    public static void main(String[] args) {

        CowsAndBulls cowsAndBulls = new CowsAndBulls();
        cowsAndBulls.fillNumbersToBeGuessed();
        cowsAndBulls.countCowsAndBulls(cowsAndBulls.getGuesses());
        while (!cowsAndBulls.countCowsAndBulls(cowsAndBulls.getGuesses())){
            cowsAndBulls.countCowsAndBulls(cowsAndBulls.getGuesses());
        }
    }
}
