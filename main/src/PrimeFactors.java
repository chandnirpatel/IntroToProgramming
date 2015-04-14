import java.util.ArrayList;

/**
 * Created by Chandni on 4/9/2015.
 */
public class PrimeFactors {
    private int number;

    public PrimeFactors(int number){
        this.number = number;
    }


    public ArrayList<Integer> generate() {
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        for(int factorToTest = 2; factorToTest <= number; factorToTest++){
            factorList.addAll(keepAddingFactorToList(factorToTest));
        }
        return factorList;
    }

    public boolean checkIfFactor(int factorToTest) {
        return number % factorToTest == 0;
    }

    public ArrayList<Integer> keepAddingFactorToList(int factorToTest) {
        ArrayList<Integer> factorToTestList = new ArrayList<Integer>();
        while (checkIfFactor(factorToTest)){
            factorToTestList.add(factorToTest);
            number = number / factorToTest;
        }
        return factorToTestList;
    }
}

