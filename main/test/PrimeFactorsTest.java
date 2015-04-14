import junit.framework.TestCase;

import java.util.ArrayList;

/**
 * Created by Chandni on 4/14/2015.
 */
public class PrimeFactorsTest extends TestCase {


    public static void testCheckIfFactor(){
        int number = 4;
        PrimeFactors primeFactors = new PrimeFactors(number);
        int factorToTest = 2;
        boolean isFactor = primeFactors.checkIfFactor(factorToTest);
        assertEquals(true, isFactor);
    }

    public static void testCheckIfFactorisFalseFor3and4(){
        int number = 4;
        PrimeFactors primeFactors = new PrimeFactors(number);
        int factorToTest = 3;
        boolean isFactor = primeFactors.checkIfFactor(factorToTest);
        assertEquals(false, isFactor);
    }

    public static void testKeepAddingFactorToListWhen4(){
        int number = 4;
        PrimeFactors primeFactors = new PrimeFactors(number);
        int factorToTest = 2;
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        factorList = primeFactors.keepAddingFactorToList(factorToTest);
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(2);
        answer.add(2);
        assertEquals(answer, factorList);
    }

    public static void testGenerate1(){
        int number = 1;
        PrimeFactors primeFactors = new PrimeFactors(number);
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        factorList = primeFactors.generate();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        assertEquals(answer, factorList);
    }

    public static void testGenerate30(){
        int number = 30;
        PrimeFactors primeFactors = new PrimeFactors(number);
        ArrayList<Integer> factorList = new ArrayList<Integer>();
        factorList = primeFactors.generate();
        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(2);
        answer.add(3);
        answer.add(5);
        assertEquals(answer, factorList);
    }

}